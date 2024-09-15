package pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {

    private static final SelenideElement CHECKOUT_BUTTON  = $(".checkout_button");
    private static final ElementsCollection CART_ITEM = $$(".cart-item");
    private static final ElementsCollection REMOVE_BUTTON = $$(".cart-button");

    public Router removeItem(int itemIndex){
        REMOVE_BUTTON.get(itemIndex).click();
        return new Router();
    }

    public Router clickCheckout() {
        CHECKOUT_BUTTON.click();
        return new Router();
    }

    public Router checkItemCount(int itemCount) {
        CART_ITEM.shouldHave(size(itemCount));
        return new Router();
    }

}
