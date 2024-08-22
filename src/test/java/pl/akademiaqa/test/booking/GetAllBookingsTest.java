package pl.akademiaqa.test.booking;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.requests.booking.requests.GetAllBookingsRequest;

public class GetAllBookingsTest {

    @Test
    void getBookingIDs() {
        final Response response = GetAllBookingsRequest.getAllBookingIDs();

        JsonPath json = response.jsonPath();
        Assertions.assertThat(json.getList("bookingid").size()).isPositive();
    }

}
