package pl.akademiaqa.requests.booking.auth;

import io.restassured.http.ContentType;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static pl.akademiaqa.data.Urls.AUTH_URL;

public class PostAuthRequest {

    public static String createToken(JSONObject authInfo)

    {
        return given()
                .contentType(ContentType.JSON)
                .body(authInfo.toString())
                .post(AUTH_URL)
                .then()
                .statusCode(200)
                .extract()
                .response()
                .jsonPath()
                .getString("token");
    }
}
