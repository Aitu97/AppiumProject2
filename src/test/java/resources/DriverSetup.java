package resources;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSetup implements Cloneable{

    private static AndroidDriver<AndroidElement>driver;

    public static AndroidDriver<AndroidElement> setUpAppiumDriver() throws MalformedURLException {

        File myApk = new File("src/test/java/General-Store.apk");

        if (driver!=null){
            return driver;
        }else {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AituAndroid");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            desiredCapabilities.setCapability(MobileCapabilityType.APP, myApk.getAbsolutePath());

            URL appiumServer = new URL("http://127.0.0.1:4723/wd/hub");

            AndroidDriver<AndroidElement> driver = new AndroidDriver(appiumServer, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return driver;
        }
    }

    @Override
    public DriverSetup clone(){
      throw new RuntimeException("Sorry you can't clone it!");
    }
}
