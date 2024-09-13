package util;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

abstract public class BaseConfig {

    @BeforeSuite
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.saucedemo.com/";
        Configuration.timeout = 7;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }
}
