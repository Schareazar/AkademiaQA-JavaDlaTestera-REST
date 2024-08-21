package pl.akademiaqa.test.booking;

import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.dto.Booking;
import io.restassured.response.Response;
import pl.akademiaqa.requests.booking.requests.PatchBookingRequest;
import pl.akademiaqa.requests.booking.requests.PostBookingRequest;

public class PatchBookingTest {
    @Test
    void patchBookingTest() {
        String defaultBookingID = PostBookingRequest.createBooking(Booking.getBooking()).jsonPath().getString("bookingid");

        JSONObject patchedJSON = new JSONObject();
        patchedJSON.put("firstname", "Patch");
        patchedJSON.put("lastname", "Update");

        Response patchedBooking = PatchBookingRequest.patchBooking(patchedJSON, defaultBookingID);

        Assertions.assertAll(
                () -> Assertions.assertEquals("Patch", patchedBooking.jsonPath().getString("firstname")),
                () -> Assertions.assertEquals("Update", patchedBooking.jsonPath().getString("lastname"))
        );


    }
}
