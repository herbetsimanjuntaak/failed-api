package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Models {

    private static RequestSpecification request;

    public static void setUpHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer 2259048ef8b50ff36a730b1d6dcd5962cd3c9aa5210a7b4ca68b92c36d8abfc9");
    }

    public static Response getRequest(String endpoint) {
        setUpHeaders();
        return request.when().get(endpoint);
    }

    public static Response getRequestByID(String endpoint,int id) {
        setUpHeaders();
        return request.when().get(endpoint+"/"+id);
    }
}
