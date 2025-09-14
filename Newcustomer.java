package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newcustomer {

	
	public static void main(String[] args) {
		ChromeDriver cust = new ChromeDriver();
		cust.manage().window().maximize();
		cust.get("https://demo.guru99.com/V4/");
//		cust.findElement(By.name("uid")).sendKeys("mngr630895");
//		cust.findElement(By.name("password")).sendKeys("UzYrYgy");
//		cust.findElement(By.name("btnLogin")).click();
//		cust.findElement(By.linkText("New Customer")).click();
//		cust.findElement(By.name("name")).sendKeys("Kumar");
//		cust.findElement(By.name("rad1")).click();
//		cust.findElement(By.name("dob")).sendKeys("20.07.2000");
//		cust.findElement(By.name("addr")).sendKeys("No Gandhi Nagar Chennai 100");
//		cust.findElement(By.name("city")).sendKeys("Chennai");
//		cust.findElement(By.name("state")).sendKeys("Tamil Nadu");
//		cust.findElement(By.name("pinno")).sendKeys("600014");
//		cust.findElement(By.name("telephoneno")).sendKeys("0987654321");
//		cust.findElement(By.name("emailid")).sendKeys("ab10@email.com");
//		cust.findElement(By.name("password")).sendKeys("abcde12345");
//		cust.findElement(By.name("sub")).click();
		
		//xpath

		cust.findElement(By.xpath("//input[@name= 'uid']")).sendKeys("mngr630895");
		cust.findElement(By.xpath("//input[@type= 'password']")).sendKeys("UzYrYgy");
		cust.findElement(By.xpath("//input[@type= 'submit']")).click();
		cust.findElement(By.xpath("//a[text()='New Customer']")).click();
		cust.findElement(By.xpath("//input[@name= 'name']")).sendKeys("Kumar");
		cust.findElement(By.xpath("//input[@value= 'm']")).click();
		cust.findElement(By.xpath("//input[@name= 'dob']")).sendKeys("20.07.2000");
		cust.findElement(By.xpath("//textarea[@name= 'addr']")).sendKeys("No Gandhi Nagar Chennai 100");
		cust.findElement(By.xpath("//input[@name= 'city']")).sendKeys("Chennai");
		cust.findElement(By.xpath("//input[@name= 'state']")).sendKeys("Tamil Nadu");
		cust.findElement(By.xpath("//input[@name= 'pinno']")).sendKeys("600014");
		cust.findElement(By.xpath("//input[@name= 'telephoneno']")).sendKeys("0987654321");
		cust.findElement(By.xpath("//input[@name= 'emailid']")).sendKeys("ab10@email.com");
		cust.findElement(By.xpath("//input[@type= 'password']")).sendKeys("abcde12345");
		cust.findElement(By.xpath("//input[@type= 'submit']")).click();
		
		

	}

}
