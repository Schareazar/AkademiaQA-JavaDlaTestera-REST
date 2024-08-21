package pl.akademiaqa.test.booking;

import org.junit.jupiter.api.Test;
import pl.akademiaqa.dto.AuthInfo;
import pl.akademiaqa.requests.booking.auth.PostAuthRequest;

public class PatchBookingTest {
    @Test
    void patchBookingTest()
    {
      String authToken = PostAuthRequest.createToken(AuthInfo.getAdminAuthJson());
    }
}
