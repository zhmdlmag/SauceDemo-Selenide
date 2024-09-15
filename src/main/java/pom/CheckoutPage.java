package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private static final SelenideElement FIRST_NAME_INPUT = $("#first-name");
    private static final SelenideElement LAST_NAME_INPUT  = $("#last-name");
    private static final SelenideElement POSTAL_CODE_INPUT = $("#postal-code");
    private static final SelenideElement CONTINUE_BUTTON   = $("#continue");

    public Router insertFirstName(String firstName) {
        FIRST_NAME_INPUT.val(firstName);
        return new Router();
    }

    public Router insertLastName(String lastName) {
        LAST_NAME_INPUT.val(lastName);
        return new Router();
    }

    public Router insertPostalCode(String postalCode) {
        POSTAL_CODE_INPUT.val(postalCode);
        return new Router();
    }

    public Router clickContinueButton() {
        CONTINUE_BUTTON.click();
        return new Router();
    }

}
