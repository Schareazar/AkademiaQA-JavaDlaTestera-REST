package pl.akademiaqa.test.booking;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.akademiaqa.requests.booking.GetBookingIDsRequest;

public class GetAllBookingIDsTest {

    @Test
    void getBookingIDs() {
        final Response response = GetBookingIDsRequest.getAllBookingIDs();

        JsonPath json = response.jsonPath();
        Assertions.assertThat(json.getList("bookingid").size()).isPositive();
    }

}
