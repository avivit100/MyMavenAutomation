import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void OpenSelenium(){
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Installs\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.google.co.il/maps?source=tldso");

            driver.findElement(By.id("searchboxinput")).sendKeys("Israel");
            driver.findElement(By.id("searchbox-searchbutton")).click();
        }
        catch(WebDriverException ex) {
            System.out.println("Can't find page element.");
        }

        System.out.println("My URL: " + driver.getCurrentUrl());
        System.out.println("My Title: " + driver.getTitle());
        System.out.println("My source: " + driver.getPageSource());
        System.out.println("My handle: " + driver.getWindowHandle());
        System.out.println("My manage: " + driver.manage());

        driver.close();
    }
}
