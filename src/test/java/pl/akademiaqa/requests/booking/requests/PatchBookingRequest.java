package pl.akademiaqa.requests.booking.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import pl.akademiaqa.dto.AuthInfo;
import pl.akademiaqa.requests.booking.auth.PostAuthRequest;

import static io.restassured.RestAssured.given;

public class PatchBookingRequest {

    private static final String authToken = PostAuthRequest.createToken(AuthInfo.getAdminAuthJson());

    public static Response patchBooking(JSONObject updatedBooking, String bookingId) {
        return given()
                .contentType(ContentType.JSON)
                .body(updatedBooking.toString())
                .header("cookie", "token=" + authToken)
                .when()
                .patch("https://restful-booker.herokuapp.com/booking/" + bookingId)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
