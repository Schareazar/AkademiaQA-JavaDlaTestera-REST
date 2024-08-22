package pl.akademiaqa.data;

import org.json.JSONObject;

public class Booking {
    public static JSONObject getBooking() {
        JSONObject bookingDates = new JSONObject();
        bookingDates.put("checkin", "2024-20-09");
        bookingDates.put("checkout", "2024-25-10");

        JSONObject booking = new JSONObject();
        booking.put("firstname", "User");
        booking.put("lastname", "Testowy");
        booking.put("totalprice", 1500);
        booking.put("depositpaid", true);
        booking.put("additionalneeds", "clean");
        booking.put("bookingdates", bookingDates);

        return booking;
    }
}
