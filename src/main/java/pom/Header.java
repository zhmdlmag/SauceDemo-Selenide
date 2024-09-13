package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class Header {

    private static final SelenideElement BURGER_MENU = $(".bm-menu-wrap");
    private static final SelenideElement SHOPPING_CART = $(".shopping_cart_container");
    private static final SelenideElement ITEMS_COUNT = $(".shopping_cart_badge");

    public Router clickOnMenu() {
        BURGER_MENU.click();
        return new Router();
    }

    public Router clickOnCart() {
        SHOPPING_CART.click();
        return new Router();
    }

    public Router checkCartItemsCount(String itemsCount) {
        ITEMS_COUNT.shouldHave(exactText(itemsCount));
        return new Router();
    }

    public Router checkCartIsEmpty() {
        ITEMS_COUNT.shouldNot(exist);
        return new Router();
    }

}
