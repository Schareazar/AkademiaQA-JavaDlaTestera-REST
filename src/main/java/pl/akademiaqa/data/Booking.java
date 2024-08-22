package pl.akademiaqa.data;

import org.json.JSONObject;

public class Booking {
    public static JSONObject getBooking() {
        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2024-09-09");
        bookingDates.put("checkout", "2024-10-10");

        JSONObject booking = new JSONObject();
        booking.put("firstname", "User");
        booking.put("lastname", "Testowy");
        booking.put("totalprice", 1500);
        booking.put("depositpaid", true);
        booking.put("additionalneeds", "clean");
        booking.put("bookingdates", bookingDates);

        return booking;
    }
    public static JSONObject getChangedBooking() {
        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2025-05-05");
        bookingDates.put("checkout", "2025-06-06");

        JSONObject booking = new JSONObject();
        booking.put("firstname", "Changed");
        booking.put("lastname", "Data");
        booking.put("totalprice", 100900);
        booking.put("depositpaid", false);
        booking.put("additionalneeds", "changed sheets");
        booking.put("bookingdates", bookingDates);

        return booking;
    }
}
