//**Project-1 - ProjectName: com-tricentis
//BaseUrl = https://demowebshop.tricentis.com/
//1. Set up Chrome browser.
//2. Open URL.
//3. Print the title of the page.
//4. Print the current URL.
//5. Print the page source.
//6. Navigate to Url.
//“https://demowebshop.tricentis.com/login ”
//7. Print the current URL.
//8. Navigate back to the home page.
//9. Navigate to the login page.
//10. Print the current URL.
//11. Refresh the page.
//12. Enter the email in the email field.
//13. Enter the password in the password field.
//14. Click on the Login Button.
//15. Close the browser.
package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {


        String baseURL = "https://demowebshop.tricentis.com/";
        // Launch Browser
        WebDriver driver = new EdgeDriver();
        //open URL in Browser
        driver.get(baseURL);
        //print current url
        System.out.println("Base URL IS: " + baseURL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //print page source
        System.out.println("The source page is: " + driver.getPageSource());

        //navigate to login url
        String loginurl = "https://demowebshop.tricentis.com/login";
        driver.navigate().to(loginurl);
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //back to homepage
        driver.navigate().back();

        //navigate to log in in page
        driver.navigate().forward();
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();


        //find ID and Password input field using element
        WebElement emailInput = driver.findElement(By.id("Email"));
        WebElement passwordInput = driver.findElement(By.id("Password"));
        WebElement loginLink = driver.findElement(By.linkText("Log in"));

        //action on element
        emailInput.sendKeys("tester@gmail.com");
        passwordInput.sendKeys("tester12345");
        loginLink.click();


        //close the browser
        driver.close();
    }
}
