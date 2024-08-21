package pl.akademiaqa.requests.booking.requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetBookingIDsRequest
{
    public static Response getAllBookingIDs()
    {
       return given()
                .when()
                .get("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}
