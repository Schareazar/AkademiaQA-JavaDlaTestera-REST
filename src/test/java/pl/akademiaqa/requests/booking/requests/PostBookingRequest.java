package pl.akademiaqa.requests.booking.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static pl.akademiaqa.data.Urls.BOOKING_URL;

public class PostBookingRequest {
    public static Response createBooking(JSONObject booking) {
        return given()
                .contentType(ContentType.JSON)
                .body(booking.toString())
                .when()
                .post(BOOKING_URL)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
