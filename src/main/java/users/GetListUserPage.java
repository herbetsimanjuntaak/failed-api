package users;

import io.restassured.response.Response;
import utilities.Models;

import static org.assertj.core.api.Assertions.assertThat;

public class GetListUserPage {
    Response res;


    public void hitGetAPIGetListUser(String endpoint) {
        res = Models.getRequest(endpoint);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int statusCode) {
        assertThat(res.statusCode()).isEqualTo(statusCode);
    }
}
