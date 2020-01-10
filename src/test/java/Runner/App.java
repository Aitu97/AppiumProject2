package Runner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import resources.DriverSetup;

import java.net.MalformedURLException;

public class App {

    private static AndroidDriver<AndroidElement> driver;
    @Test
    public void negativeLogIn() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = DriverSetup.setUpAppiumDriver();

       // AndroidElement enterName = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
       // enterName.sendKeys(" ");

        AndroidElement letsShop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));

        letsShop.click();

        AndroidElement toastMessage=driver.findElement(By.xpath("//android.widget.Toast[1]"));
        String error= toastMessage.getAttribute("name");

        System.out.println(error);



    }

    @Test
    public void PositiveLogIn() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = DriverSetup.setUpAppiumDriver();

         AndroidElement enterName = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
         enterName.sendKeys("aitu");

        AndroidElement letsShop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));

        letsShop.click();

        AndroidElement productTitle = driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title"));
        String productactual=productTitle.getText();
        String productEXp="Products";
        Assert.assertEquals(productEXp,productactual);



    }



    @Test
    public void PositiveLogIn2() throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = DriverSetup.setUpAppiumDriver();

        AndroidElement enterName = driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
        enterName.sendKeys("aitu");

        AndroidElement letsShop = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));

        letsShop.click();

        AndroidElement addToCart = driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"));

        addToCart.click();



    }
}
