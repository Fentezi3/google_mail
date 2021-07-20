package org.example.driver;

import com.codeborne.selenide.WebDriverRunner;
import com.google.inject.Singleton;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Collections;

@Singleton
public class DriverUtils {
    
    public static void runChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--verbose");
        options.addArguments("-bb-no-sandbox");
        options.addArguments("--whitelisted-ips");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriverRunner.setWebDriver(new ChromeDriver(options));
    }
    
    public static void tearDownBrowser(){
        WebDriverRunner.closeWebDriver();
    }
}
