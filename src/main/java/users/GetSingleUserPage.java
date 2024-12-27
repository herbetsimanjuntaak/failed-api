package users;

import io.restassured.response.Response;
import utilities.Models;

import static org.assertj.core.api.Assertions.assertThat;

public class GetSingleUserPage {
    Response res;


    public void hitGetAPIGetSingleUser(String endpoint,int userID) {
        res = Models.getRequestByID(endpoint,userID);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int statusCode) {
        assertThat(res.statusCode()).isEqualTo(statusCode);
    }
}
