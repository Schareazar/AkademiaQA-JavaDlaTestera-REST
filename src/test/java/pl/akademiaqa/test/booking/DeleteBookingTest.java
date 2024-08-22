package pl.akademiaqa.test.booking;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.helpers.BookingID;
import pl.akademiaqa.requests.booking.requests.DeleteBookingRequest;

public class DeleteBookingTest {

    @Test
    void deleteBookingTest() {

        Response deletedBooking = DeleteBookingRequest.deleteBooking(BookingID.get());

        Assertions.assertEquals(201, deletedBooking.getStatusCode());
    }
}
