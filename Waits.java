package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		
		ChromeDriver wait = new ChromeDriver();
		wait.get("https://www.google.com/");
		wait.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("selenium");
		wait.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ENTER);
		//wait.findElement(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']")).click();
		WebDriverWait wait2 = new WebDriverWait(wait,Duration.ofSeconds(10));
		WebElement until = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium Testing: Detailed Guide']")));
		until.click();
		
		

		
		
	}

}
