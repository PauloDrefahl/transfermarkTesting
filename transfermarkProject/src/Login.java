import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/dylangarcia/Documents/SeleniumDrivers/Chromedriver/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the main page
        driver.get("https://www.transfermarkt.com/");
        Thread.sleep(2000);

        // Switch to the iframe with the specified title
        driver.switchTo().frame(driver.findElement(By.cssSelector("#sp_message_iframe_953358")));
        Thread.sleep(2000);

        // Find the accept button within the iframe and click it
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/div[1]/div/button"));
        acceptButton.click();

        // Switch back to the main page
        driver.switchTo().defaultContent();

        WebElement login = driver.findElement(By.id("login"));
        login.click();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.id("LoginForm_username"));
        username.sendKeys("Username");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("LoginForm_password"));
        password.sendKeys("Password");
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
