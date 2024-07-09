import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Vinted {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://careers.vinted.com/?gh_jid=4361020101&gh_src=2aee7c72teu");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
            acceptCookiesButton.click();

            WebElement searchJobsButtonIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button-large-decoration .button-icon-white")));
            searchJobsButtonIcon.click();

            WebElement locationDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".default-select-control[aria-label='Filter Location']")));
            locationDropdown.click();

            WebElement vilniusOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Vilnius, Lithuania']")));
            vilniusOption.click();

            WebElement departmentDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".default-select-control[aria-label='Filter Department']")));
            departmentDropdown.click();

            WebElement engineeringOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Engineering']")));
            engineeringOption.click();

            WebElement companyDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".default-select-control[aria-label='Filter Company']")));
            companyDropdown.click();

            WebElement vintedGroupOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Vinted Group']")));
            vintedGroupOption.click();

            WebElement jobListing = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Junior Quality Assurance Engineer - Vinted Academy')]")));
            jobListing.click();

        } finally {
        }
    }
}
