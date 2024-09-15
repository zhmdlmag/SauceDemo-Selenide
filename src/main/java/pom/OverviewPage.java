package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OverviewPage {

    private static final SelenideElement CANCEL_BUTTON      = $("#cancel");
    private static final SelenideElement FINISH_BUTTON      = $("#finish");
    private static final SelenideElement COMPLETE_CONTAINER = $("#checkout_complete_container");
    private static final SelenideElement BACK_HOME          = $("#back-to-products");

    public Router clickFinishButton() {
        FINISH_BUTTON.click();
        return new Router();
    }

    public Router clickCancelButton() {
        CANCEL_BUTTON.click();
        return new Router();
    }

    public Router checkOrderIsComplete() {
        COMPLETE_CONTAINER.click();
        return new Router();
    }

    public Router clickBackHomeButton() {
        BACK_HOME.click();
        return new Router();
    }

}
