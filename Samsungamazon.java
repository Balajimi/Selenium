package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsungamazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver samz = new ChromeDriver ();
		samz.get("https://www.amazon.in");
		samz.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		samz.findElement(By.id("nav-search-submit-button")).click();
		
		samz.findElement(By.xpath("//span[text()='Get It Today']")).click();
		Thread.sleep(5000);
		samz.findElement(By.xpath("//span[text()='Samsung']")).click();
		//samz.findElement(By.xpath("//span[text()='Samsung Galaxy A55 5G (Awesome Navy, 8GB RAM, 128GB Storage) | AI | Metal Frame | 50 MP Main Camera (OIS) | Super HDR Video| Nightography | IP67 | Corning Gorilla Glass Victus+ | sAMOLED Display']")).click();
	}
}
