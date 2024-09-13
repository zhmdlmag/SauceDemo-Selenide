package pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage {

    private static final SelenideElement INVENTORY_CONTAINER = $("#inventory_container");
    private static final ElementsCollection ITEM_NAME = $$("inventory_item_name ");
    private static final ElementsCollection ADD_TO_CART_BUTTON = $$(".btn_inventory");
    private static final ElementsCollection ITEM_LABEL = $$(".inventory_item_label");

    public Router checkProductsPageIsOpen() {
        INVENTORY_CONTAINER.should(visible);
        return new Router();
    }

    public Router addItemToCart(int itemIndex) {
        ADD_TO_CART_BUTTON.get(itemIndex).click();
        return new Router();
    }

}
