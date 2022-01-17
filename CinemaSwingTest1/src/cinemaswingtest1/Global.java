
package cinemaswingtest1;

import java.util.ArrayList;
import java.util.List;

public class Global {
    public static String customer_email = "";
    public static String movie_name = "";
    public static String seat_no = "";
    public static String cnt_seat = "";
    public static String ticket_class = "";
    public static String day = "";
    public static String time = "";
    public static String Url=""; 
    public static int movie_idx;
    public static List<Integer> booked_seat0 = new ArrayList<>();
    public static List<Integer> booked_seat1 = new ArrayList<>();
    public static List<Integer> booked_seat2 = new ArrayList<>();
    public static List<Integer> booked_seat3 = new ArrayList<>();
    public static List<Integer> booked_seat4 = new ArrayList<>();
    
    public static List<List<Integer>> list = new ArrayList<>() {
        {
            add(booked_seat0);
            add(booked_seat1);
            add(booked_seat2);
            add(booked_seat3);
            add(booked_seat4);
        }
    };
    public static List<Integer> booked_seat0L = new ArrayList<>();
    public static List<Integer> booked_seat1L = new ArrayList<>();
    public static List<Integer> booked_seat2L = new ArrayList<>();
    public static List<Integer> booked_seat3L = new ArrayList<>();
    public static List<Integer> booked_seat4L = new ArrayList<>();
    public static List<List<Integer>> listL = new ArrayList<>() {
        {
            add(booked_seat0L);
            add(booked_seat1L);
            add(booked_seat2L);
            add(booked_seat3L);
            add(booked_seat4L);
        }
    };
}
