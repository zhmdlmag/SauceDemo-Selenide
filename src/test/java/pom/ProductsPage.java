package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {

    private static final SelenideElement INVENTORY_CONTAINER = $("#inventory_container");

    public Router checkProductsPageIsOpen(){
        INVENTORY_CONTAINER.should(visible);
        return new Router();
    }

}
