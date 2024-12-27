package steps.users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import users.GetListUserPage;

public class GetListUserSteps {

    GetListUserPage getListUserPage = new GetListUserPage();

    @Given("sends a GET request to the {string} endpoint")
    public void sendsAGETRequestToTheEndpoint(String endpoint) {
        getListUserPage.hitGetAPIGetListUser(endpoint);
    }

    @Then("status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        getListUserPage.validationStatusCodeIsEquals(statusCode);
    }
}
