package com.edEra1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void FirstTest() {

        System.setProperty("webdriver.chrome.driver",
                "F:\\IT test Programs\\edEra\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.get("https://www.ed-era.com/");
String title = driver.getTitle();
Assert.assertTrue(title.equals("EdEra – студія онлайн-освіти"));

driver.quit();
    }
}
