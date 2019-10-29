import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;

    @Test
    public void testJenkinsExecution() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("amazon page loaded");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java Books");
        driver.findElement(By.xpath("//div[@id='nav-search']/form[@role='search']//input[@value='Go']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5);
        driver.quit();
    }
}
