package selenium;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCartXPath {
    public static void main(String[] args) throws InterruptedException {
        // No need to set system property anymore
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.in");

        // Search for iPhone
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        // Click on the first product
        driver.findElement(By.xpath("//h2[@aria-label='Apple iPhone 13 (128GB) - Blue']")).click();

//        // Switch to product tab
//        for (String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//        }

        Thread.sleep(5000);
        // Click Add to Cart
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]")).click();
        

        // Print message
        System.out.println("iPhone added to cart successfully!");

     
    }
}
