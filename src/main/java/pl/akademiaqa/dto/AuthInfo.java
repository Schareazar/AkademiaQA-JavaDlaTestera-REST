package pl.akademiaqa.dto;

import org.json.JSONObject;

public class AuthInfo {

    public static JSONObject getAdminAuthJson() {
        JSONObject authJson = new JSONObject();
        authJson.put("username", "admin");
        authJson.put("password", "password123");
        return authJson;
    }
}
