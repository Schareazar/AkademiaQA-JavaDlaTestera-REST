package pl.akademiaqa.helpers;

import pl.akademiaqa.data.Booking;
import pl.akademiaqa.requests.booking.requests.PostBookingRequest;

public class BookingID {

    public static String get()
    {
        return PostBookingRequest.createBooking(Booking.getBooking()).jsonPath().getString("bookingid");
    }
}
