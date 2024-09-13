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

        open(Configuration.baseUrl);

        new Router()
                .authPage.insertUsername(username)
                .authPage.insertPassword(password)
                .authPage.clickLogin()
                .productsPage.checkProductsPageIsOpen();
    }

}
