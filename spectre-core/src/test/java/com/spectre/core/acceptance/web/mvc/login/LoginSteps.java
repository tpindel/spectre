package com.spectre.core.acceptance.web.mvc.login;

import javax.inject.Inject;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.stereotype.Component;

@Component
public class LoginSteps {

    @Inject
    private LoginAgent loginAgent;

    @Given("Login page is available")
    public void loginPageIsAvailable() {
        loginAgent.navigateToLoginPage();
    }

    @When("I submit the credetials")
    public void confirmCredentials() {
        loginAgent.submit();
    }

    @Then("I should be able to visit home page")
    public void shouldHomePageBeOnHomePage() {

    }

}
