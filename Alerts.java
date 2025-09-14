package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		ChromeDriver alt = new ChromeDriver();
		alt.get("https://demo.guru99.com/test/delete_customer.php");
		alt.findElement(By.xpath("//input[@type='text']")).sendKeys("012345");
		alt.findElement(By.xpath("//input[@type='submit']")).click();
		// alt.switchTo().alert().accept();
		// alt.switchTo().alert().dismiss();
		alt.switchTo().alert().getText();

		System.out.println(alt.switchTo().alert().getText());

	}
}