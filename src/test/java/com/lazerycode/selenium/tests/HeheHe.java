package com.lazerycode.selenium.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeheHe {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://way2automation.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testWay2automation() throws Exception {
    driver.get(baseUrl + "/way2auto_jquery/index.php");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Anupam");
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("9876543210");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("mail@gmail.com");
    driver.findElement(By.cssSelector("option[value=\"Georgia\"]")).click();
    driver.findElement(By.cssSelector("option[value=\"India\"]")).click();
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Kolkata");
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("anumaiti");
    driver.findElement(By.xpath("(//input[@name='password'])[2]")).click();
    driver.findElement(By.xpath("(//input[@name='password'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("admin@123");
    driver.findElement(By.cssSelector("#load_box > #load_form > div.bottom.row > div.span_1_of_4 > input.button")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
