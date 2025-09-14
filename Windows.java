package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver win = new ChromeDriver();
		win.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		win.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowHandles = win.getWindowHandles();
		 Iterator<String> iterator = windowHandles.iterator();
		 
		 String parentwindow = iterator.next();
		 String childwindow = iterator.next();
		 win.switchTo().window(childwindow);
		 String text = win.findElement(By.xpath("//div[@class='page-title']")).getText();
		 
		 System.out.println(text);
		
	}

}
