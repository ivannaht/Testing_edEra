package com.edEra1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {

    @Test
    public void FirstTest() {

        System.setProperty("webdriver.chrome.driver",
                "F:\\IT test Programs\\edEra\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();

driver.get("https://www.ed-era.com/");
String title = driver.getTitle();
Assert.assertTrue(title.equals("EdEra – студія онлайн-освіти"));

        WebElement body = driver.findElement(By.cssSelector("body"));
        body.findElement(By.cssSelector("[href=\"https://courses.ed-era.com/register\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated (By.id ("register")));

driver.quit();
    }
}
