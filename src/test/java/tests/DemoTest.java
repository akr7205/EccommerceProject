package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class DemoTest extends BaseTest {

    @Test
    public void landingage(){
      driver.findElement(By.cssSelector("a[class='wp-block-button__link']")).click();

    }
}
