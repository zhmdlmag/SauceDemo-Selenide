package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {

    private static final SelenideElement
            USERNAME_INPUT = $("#user-name"),
            PASSWORD_INPUT = $("#password"),
            LOGIN_BUTTON   = $("#login-button");

    public Router insertUsername(String username) {
        USERNAME_INPUT.val(username);
        return new Router();
    }

    public Router insertPassword(String password) {
        PASSWORD_INPUT.val(password);
        return new Router();
    }

    public Router clickLogin() {
        LOGIN_BUTTON.click();
        return new Router();
    }

}
