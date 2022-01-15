package cinemaswingtest1;

/**
 * Setup: This class required JSON Library CTRL press this:
 * https://search.maven.org/remotecontent?filepath=org/json/json/20211205/json-20211205.jar
 * Drag and Drop the jar file into the directory you want Right click the
 * project and select properties Go to libraries, press the + besides the class
 * path Click add JAR/folder Select that jar downloaded file All done!
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
import java.util.Date;
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
//        System.out.println(body);

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
            String message = json.getString("message");

            System.out.println(message);
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
    public static boolean staffSignUp(String id,String name, String email, String password) throws Exception {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("staff_id", id);
            data.put("name", name);
            data.put("email", email);
            data.put("password", password);
//            data.put("phone_number", phone_number);

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

    public static boolean createMovie(String name,
            String release_date,
            String cast,
            String synopsis,
            String day,
            String time,
            int total_seat,
            String image_url) {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("release_date", release_date);
            data.put("cast", cast);
            data.put("synopsis", synopsis);
            data.put("day", day);
            data.put("time", time);
            data.put("total_seat", total_seat);
            data.put("image_url", image_url);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
//                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/movie/create"))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/movie/create"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String body = response.body();
            
            JSONObject json = new JSONObject(body);
            return statusCode == 200;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static boolean bookSeat(String customer_email, String seat_id) {
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            data.put("email", customer_email);
            data.put("seat_id", seat_id);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/movie/book"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String body = response.body();

            return statusCode == 200;
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public static List<Movie> getAllMovie() throws Exception {
        List<Movie> list = new ArrayList<>();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/movie/get_all_movie"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        int statusCode = response.statusCode();
        String body = response.body();

        JSONObject json = new JSONObject(body);
        JSONArray movies = json.getJSONArray("movie");

        for (int i = 0; i < movies.length(); i++) {
            JSONObject movie = (JSONObject) movies.get(i);
            String name = (String) movie.get("name");
            String release_date = (String) movie.get("release_date");
            String cast = (String) movie.get("cast");
            String synopsis = (String) movie.get("synopsis");
            String day = (String) movie.get("day");
            String time = (String) movie.get("time");
            int total_seat = (int) movie.get("total_seat");
            String image_url = (String) movie.get("image_url");
            Movie c = new Movie(name, release_date, cast, synopsis, day, time, total_seat, image_url);
            list.add(c);
        }

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).name;
            String release_date = list.get(i).release_date;
            String cast = list.get(i).cast;
            String synopsis = list.get(i).synopsis;
            String day = list.get(i).day;
            String time = list.get(i).time;
            int total_seat = list.get(i).total_seat;
            String image_url = list.get(i).image_url;
            

//            System.out.println("Customer " + (i + 1) + ": " + name + " " + email + " " + phone_number);
        }

        return list;
    }
    
    public static void getAllSeat(String movie_id){
        try {
            // form parameters
            Map<Object, Object> data = new HashMap<>();
            
            data.put("movie_id", movie_id);

            HttpRequest request = HttpRequest.newBuilder()
                    .POST(buildFormDataFromMap(data))
                    .uri(URI.create("https://cinema-db-schema-1.vercel.app/api/movie/get_all_seat"))
                    .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String body = response.body();
            System.out.println(body);
           
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
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

    private static class Movie {

        String name;
        String release_date;
        String cast;
        String synopsis;
        String day;
        String time;
        int total_seat;
        String image_url;

        public Movie(String name, String release_date, String cast, String synopsis, String day, String time, int total_seat, String image_url) {
            this.name = name;
            this.release_date = release_date;
            this.cast = cast;
            this.synopsis = synopsis;
            this.day = day;
            this.time = time;
            this.total_seat = total_seat;
            this.image_url = image_url;
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