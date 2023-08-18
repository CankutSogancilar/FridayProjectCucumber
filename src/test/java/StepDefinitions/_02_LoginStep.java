package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class _02_LoginStep {
    Elements elements = new Elements();

    @And("Enter username as a {string}")
    public void enterUsernameAsA(String username) {
        elements.sendKeysMethod(elements.loginUsername, username);
    }

    @And("Enter password as a {string}")
    public void enterPasswordAsA(String password) {
        elements.sendKeysMethod(elements.loginPassword, password);
    }

    @And("I click login button")
    public void iClickLoginButton() {

        elements.clickMethod(elements.loginButton);
    }

    @And("Confirm that Login Step is unsucssefull")
    public void confirmThatLoginStepIsUnsucssefull() {

        elements.assertText(elements.invalidConfirm, "Error!");

    }

    @And("Confirm that Login Step is Successful")
    public void confirmThatLoginStepIsSuccessful() {

        elements.assertText(elements.validConfirm, "Overview");

    }


}
