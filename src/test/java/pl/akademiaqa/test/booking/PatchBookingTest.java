package pl.akademiaqa.test.booking;

import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;
import pl.akademiaqa.helpers.BookingID;
import pl.akademiaqa.requests.booking.requests.PatchBookingRequest;

public class PatchBookingTest {
    @Test
    void patchBookingTest() {

        JSONObject patchedJSON = new JSONObject();
        patchedJSON.put("firstname", "Patch");
        patchedJSON.put("lastname", "Update");

        Response patchedBooking = PatchBookingRequest.patchBooking(patchedJSON, BookingID.get());

        Assertions.assertAll(
                () -> Assertions.assertEquals("Patch", patchedBooking.jsonPath().getString("firstname")),
                () -> Assertions.assertEquals("Update", patchedBooking.jsonPath().getString("lastname"))
        );


    }
}
