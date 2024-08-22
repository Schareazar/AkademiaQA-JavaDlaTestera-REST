package pl.akademiaqa.test.booking;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.data.Booking;
import pl.akademiaqa.requests.booking.requests.PostBookingRequest;

public class CreateBookingTest {

    @Test
    void createBookingTest() {
        Response response = PostBookingRequest.createBooking(Booking.getBooking());

        Assertions.assertEquals("User", response.jsonPath().getString("booking.firstname"));
        Assertions.assertTrue(response.jsonPath().getBoolean("booking.depositpaid"));

    }
}
