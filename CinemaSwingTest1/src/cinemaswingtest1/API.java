package cinemaswingtest1;

/**
 * Setup:
 * This class required JSON Library
 * CTRL press this: https://search.maven.org/remotecontent?filepath=org/json/json/20211205/json-20211205.jar
 * Drag and Drop the jar file into the directory you want
 * Right click the project and select properties
 * Go to libraries, press the + besides the class path
 * Click add JAR/folder
 * Select that jar downloaded file
 * All done!
 *
 * Collapse all methods CTRL + SHIFT + MINUS(-)
 *
 * @
 */

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.*;

public class API {

    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    /**
     * Get all the customer from the database Print all customer
     *
     * @return a list of customer
     */
    public static List<Customer> getAllCustomer() throws Exception {
        List<Customer> list = new ArrayList<>();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/customer/get_all"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = response.statusCode();
        String body = response.body();

        JSONObject json = new JSONObject(body);
        JSONArray users = json.getJSONArray("user");

        for (int i = 0; i < users.length(); i++) {
            JSONObject user = (JSONObject) users.get(i);
            String name = (String) user.get("name");
            String email = (String) user.get("email");
            String phone_number = (String) user.get("phone_number");
            Customer c = new Customer(name, email, phone_number);
            list.add(c);
        }

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            String email = list.get(i).getEmail();
            String phone_number = list.get(i).getPhoneNumber();

            System.out.println("Customer " + (i + 1) + ": " + name + " " + email + " " + phone_number);
        }

        return list;
    }

    /**
     * Sign up the customer and store the new customer to the database
     *
     * @param name
     * @param email
     * @param password
     * @param phone_number
     * @return true if customer can sign up (no duplicate email), false if any
     * errors
     */
    public static boolean customerSignUp(String name, String email, String password, String phone_number) throws Exception {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("email", email);
            data.put("password", password);
            data.put("phone_number", phone_number);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/customer/signup"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();

            return statusCode == 200;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    /**
     * Check the customer email exists Check password is correct in the database
     * Login the customer
     *
     * @param email
     * @param password
     * @return true if the password entered is correct, false if there is no
     * email or incorrect password
     */
    public static boolean customerLogin(String email, String password) throws Exception {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("email", email);
            data.put("password", password);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/customer/login"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String body = response.body();

            JSONObject json = new JSONObject(body);

            boolean verified = json.getBoolean("verified");

            return verified && statusCode == 200;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    /**
     * Get all the staff from the database Print all user
     *
     * @return a list of staff
     */
    public static List<Staff> getAllStaff() throws Exception {
        List<Staff> list = new ArrayList<>();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/staff/get_all"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = response.statusCode();
        String body = response.body();

        JSONObject json = new JSONObject(body);
        JSONArray staffs = json.getJSONArray("staff");

        for (int i = 0; i < staffs.length(); i++) {
            JSONObject user = (JSONObject) staffs.get(i);
            String name = (String) user.get("name");
            String email = (String) user.get("email");
            String phone_number = (String) user.get("phone_number");
            Staff s = new Staff(name, email, phone_number);
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            String email = list.get(i).getEmail();
            String phone_number = list.get(i).getPhoneNumber();

            System.out.println("Staff " + (i + 1) + ": " + name + " " + email + " " + phone_number);
        }

        return list;
    }

    /**
     * Sign up the staff and store the new staff to the database
     *
     * @param name
     * @param email
     * @param password
     * @param phone_number
     * @return true if staff can sign up (no duplicate email), false if any
     * errors
     */
    public static boolean staffSignUp(String name, String email, String password, String phone_number) throws Exception {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("email", email);
            data.put("password", password);
            data.put("phone_number", phone_number);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/staff/signup"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();

            return statusCode == 200;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    /**
     * Check the staff email exists Check password is correct in the database
     * Login the staff
     *
     * @param email
     * @param password
     * @return true if the password entered is correct, false if there is no
     * email or incorrect password
     */
    public static boolean staffLogin(String email, String password) throws Exception {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("email", email);
            data.put("password", password);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/staff/login"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String body = response.body();

            JSONObject json = new JSONObject(body);

            boolean verified = json.getBoolean("verified");

            return verified && statusCode == 200;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    // Delete this if you have customer class
    private static class Customer {

        private String name;
        private String email;
        private String phone_number;

        public Customer(String name, String email, String phone_number) {
            this.name = name;
            this.email = email;
            this.phone_number = phone_number;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNumber() {
            return phone_number;
        }

        @Override
        public String toString() {
            return name + " " + email + " " + phone_number;
        }
    }

    // Delete this if you have staff class
    private static class Staff {

        private String name;
        private String email;
        private String phone_number;

        public Staff(String name, String email, String phone_number) {
            this.name = name;
            this.email = email;
            this.phone_number = phone_number;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNumber() {
            return phone_number;
        }

        @Override
        public String toString() {
            return name + " " + email + " " + phone_number;
        }
    }

    // Utility Method (no need to see)
    private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        System.out.println(builder.toString());
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }
}