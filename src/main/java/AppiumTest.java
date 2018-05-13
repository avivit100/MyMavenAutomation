import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumTest{
    public static void OpenAppium(){
        try {
            //Set the appium capabilities:
            AndroidDriver<MobileElement> driver;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            capabilities.setCapability("appPackage", "il.co.mintapp.buyme");
            capabilities.setCapability("appActivity", "il.co.mintapp.buyme.activities.common.SplashScreen");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        catch(WebDriverException ex){
            System.out.println("ERROR: in setting up the Appium.");
        }
        catch(Exception ex){
            System.out.println("ERROR: in setting up the Appium.");
        }
    }
}
