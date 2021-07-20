package org.example.tests;

import org.example.driver.DriverUtils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseWebTest {
    
    @BeforeClass(alwaysRun = true)
    public void runChrome() {
        DriverUtils.runChromeBrowser();
    }
    
    
    @AfterTest(alwaysRun = true)
    public void closeAll() {
        DriverUtils.tearDownBrowser();
    }
    
}
