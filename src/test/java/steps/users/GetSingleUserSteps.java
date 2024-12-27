package steps.users;

import io.cucumber.java.en.Given;
import users.GetSingleUserPage;

public class GetSingleUserSteps {

    GetSingleUserPage getSingleUserPage = new GetSingleUserPage();

    @Given("sends a GET request to the {string} endpoint and user id {int}")
    public void sendsAGETRequestToTheEndpointAndUserId(String endpoint, int userID) {
        getSingleUserPage.hitGetAPIGetSingleUser(endpoint, userID);
    }
}
