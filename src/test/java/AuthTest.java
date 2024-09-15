import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pom.Router;
import util.BaseConfig;

import static com.codeborne.selenide.Selenide.open;

public class AuthTest extends BaseConfig {

    @Test
    public void userCanLogin() {

        String username = "standard_user";
        String password = "secret_sauce";
        String value = "user";

        open(Configuration.baseUrl);

        new Router()
                .authPage.insertUsername(username)
                .authPage.insertPassword(password)
                .authPage.clickLogin()

                .productsPage.checkProductsPageIsOpen()
                .productsPage.addAllItemsToCart()

                .header.checkCartItemsCount(6)
                .header.clickOnCart()

                .cartPage.checkItemCount(6)
                .cartPage.removeItem(0)
                .cartPage.clickCheckout()

                .checkoutPage.insertFirstName(value)
                .checkoutPage.insertLastName(value)
                .checkoutPage.insertPostalCode(value)
                .checkoutPage.clickContinueButton()

                .overviewPage.clickFinishButton()
                .overviewPage.checkOrderIsComplete()
                .overviewPage.clickBackHomeButton()

                .productsPage.checkProductsPageIsOpen();
    }

}
