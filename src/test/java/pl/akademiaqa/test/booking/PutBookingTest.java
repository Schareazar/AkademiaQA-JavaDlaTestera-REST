package pl.akademiaqa.test.booking;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.data.Booking;
import pl.akademiaqa.helpers.BookingID;
import pl.akademiaqa.requests.booking.requests.PutBookingRequest;

public class PutBookingTest {

    @Test
    void putBookingTest() {

        Response putBooking = PutBookingRequest.putBooking(Booking.getChangedBooking(), BookingID.get());

        Assertions.assertAll(
                () -> Assertions.assertEquals(Booking.getChangedBooking().getJSONObject("bookingdates").getString("checkin"),
                        putBooking.jsonPath().getJsonObject("bookingdates.checkin")),
                () -> Assertions.assertEquals(Booking.getChangedBooking().getJSONObject("bookingdates").getString("checkout"),
                        putBooking.jsonPath().getJsonObject("bookingdates.checkout"))
        );
    }
}
