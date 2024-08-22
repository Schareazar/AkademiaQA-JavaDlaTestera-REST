package pl.akademiaqa.requests.booking.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pl.akademiaqa.data.AuthInfo;
import pl.akademiaqa.requests.booking.auth.PostAuthRequest;

import static io.restassured.RestAssured.given;
import static pl.akademiaqa.data.Urls.BOOKING_URL;

public class DeleteBookingRequest {

    private static final String authToken = PostAuthRequest.createToken(AuthInfo.getAdminAuthJson());

    public static Response deleteBooking (String bookingId) {
        return given()
                .contentType(ContentType.JSON)
                .header("cookie", "token=" + authToken)
                .delete(BOOKING_URL + bookingId)
                .then()
                .extract()
                .response();
    }
}

