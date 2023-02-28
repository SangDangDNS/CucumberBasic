package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stepsOrangeHRM {

    WebDriver driver;

    @Given("I launch the Chrome Browser")
    public void iLaunchTheChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open orange hrm homepage")
    public void iOpenOrangeHrmHomepage() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    @Then("I verify that the logo present on Page")
    public void iVerifyThatTheLogoPresentOnPage() {
        boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(logo,"Logo not displayed");
    }

    @And("I close the Browser")
    public void iCloseTheBrowser() {
        driver.quit();
    }
}
