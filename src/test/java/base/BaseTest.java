package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
protected WebDriver driver;
@BeforeMethod
public void  startDriver(){
    String url="https://askomdch.com";
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(url);
    // Wait until the DOM is fully loaded (readyState is either 'interactive' or 'complete')
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete"));

    // After confirming DOM is loaded, you can proceed with further actions or validations
    System.out.println("DOM is fully loaded!");

    // Example: Check the page title after DOM is loaded
    String title = driver.getTitle();
    System.out.println("Page title is: " + title);
}

}
