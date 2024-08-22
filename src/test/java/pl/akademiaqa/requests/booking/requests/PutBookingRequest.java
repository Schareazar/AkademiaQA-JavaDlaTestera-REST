package pl.akademiaqa.requests.booking.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import pl.akademiaqa.data.AuthInfo;
import pl.akademiaqa.requests.booking.auth.PostAuthRequest;

import static io.restassured.RestAssured.given;
import static pl.akademiaqa.data.Urls.BOOKING_URL;

public class PutBookingRequest {

    private static final String authToken = PostAuthRequest.createToken(AuthInfo.getAdminAuthJson());

    public static Response putBooking(JSONObject updatedBooking, String bookingId) {
        return given()
                .contentType(ContentType.JSON)
                .body(updatedBooking.toString())
                .header("cookie", "token=" + authToken)
                .when()
                .put(BOOKING_URL + bookingId)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
