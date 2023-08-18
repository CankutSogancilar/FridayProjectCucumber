package StepDefinitions;

import Pages.Elements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class _01_RegisterStep {

    Elements elements=new Elements();
    @Given("Navigate to Parabank website")
    public void navigateToParabankWebsite() {
        BaseDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @And("Create an account")
    public void createAnAccount() {
        elements.clickMethod(elements.registerButton);
        elements.sendKeysMethod(elements.nameInput,"Ahmet");
        elements.sendKeysMethod(elements.lastNameInput,"Donmez");
        elements.sendKeysMethod(elements.addressInput,"dfdfdfdfdf");
        elements.sendKeysMethod(elements.addressCityInput,"Orlando");
        elements.sendKeysMethod(elements.addressStateInput,"Fl");
        elements.sendKeysMethod(elements.adressZipCodeInput,"12465546");
        elements.sendKeysMethod(elements.phoneNumberInput,"535353535");
        elements.sendKeysMethod(elements.ssnInput,"236565656");
        elements.sendKeysMethod(elements.username,"ahmet88");
        elements.sendKeysMethod(elements.password,"123");
        elements.sendKeysMethod(elements.confirmButton,"123");
        elements.clickMethod(elements.registerRegister);
    }

    @And("Confirm your account is created successfully")
    public void confirmYourAccountIsCreatedSuccessfully() {
        elements.assertText(elements.confirmRegister,"successfully");
    }
}
