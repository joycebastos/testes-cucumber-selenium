package Util;

import org.junit.After;
import org.openqa.selenium.WebDriver;

public class basePage {
    protected WebDriver driver;

    public basePage(WebDriver driver) {
        this.driver = driver;
    }

}
