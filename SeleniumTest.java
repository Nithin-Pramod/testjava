import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website you want to test
        driver.get("https://www.example.com");

        // Verify that the page title is correct
        String expectedTitle = "Example Domain";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Page title is correct");
        } else {
            System.out.println("Page title is incorrect");
        }

        // Close the browser
        driver.quit();
    }
}