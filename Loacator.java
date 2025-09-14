package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loacator {
	

	public static void main(String[] args) {
		ChromeDriver apple = new ChromeDriver();
		apple.manage().window().maximize();
		apple.get("https://demo.guru99.com/V4/");
		apple.findElement(By.name("uid")).sendKeys("mngr630895");
		apple.findElement(By.name("password")).sendKeys("UzYrYgy");
		apple.findElement(By.name("btnLogin")).click();
		// TODO Auto-generated method stub

	}

}
