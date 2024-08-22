package pl.akademiaqa.requests.booking.requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static pl.akademiaqa.data.Urls.BOOKING_URL;

public class GetBookingIDsRequest
{
    public static Response getAllBookingIDs()
    {
       return given()
                .when()
                .get(BOOKING_URL)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
