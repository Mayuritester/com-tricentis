//*Project-1 - ProjectName: com-tricentis

package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi {
      //all variables
    static String browser = "Chrome";
    static String baseURL = "https://demowebshop.tricentis.com/";
    static String loginurl = "https://demowebshop.tricentis.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }


        driver.get(baseURL);
        System.out.println("Base URL IS: "+ baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Page title is: "+ title);
        System.out.println("The source page is: " + driver.getPageSource());
        driver.navigate(). to (loginurl);
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("Current URL is: "+ driver.getCurrentUrl());
        driver.navigate().refresh();
        WebElement emailInput =  driver.findElement(By.id("Email"));
        WebElement passwordInput =  driver.findElement(By.id("Password"));
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        emailInput.sendKeys("tester@gmail.com");
        passwordInput.sendKeys("tester12345");
        loginLink.click();

        driver.quit();
    }
}
