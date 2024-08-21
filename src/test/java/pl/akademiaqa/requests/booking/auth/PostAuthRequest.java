package pl.akademiaqa.requests.booking.auth;

import io.restassured.http.ContentType;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class PostAuthRequest {

    public static String createToken(JSONObject authInfo)

    {
        return given()
                .contentType(ContentType.JSON)
                .body(authInfo.toString())
                .post("https://restful-booker.herokuapp.com/auth")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .jsonPath()
                .getString("token");
    }
}
