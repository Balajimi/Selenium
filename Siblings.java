package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		ChromeDriver sib = new ChromeDriver();
		sib.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#");
		//sib.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Ramesh");
		sib.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("Balaji");
		sib.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]")).sendKeys("K");
		sib.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("abc@email.com");
		sib.findElement(By.xpath("(//div/input[@type='password'])[1]")).sendKeys("12345abcde");
		sib.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input[1]")).sendKeys("12345abcde");
		sib.findElement(By.xpath("//button[text()='Register']")).click();
		
		
		sib.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/input[@ type='checkbox']")).click();
		sib.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td/input[@ type='checkbox']")).click();
		sib.findElement(By.xpath("//td[text()='Roland Mendel']/preceding-sibling::td/input[@ type='checkbox']")).click();
		sib.findElement(By.xpath("//td[text()='Helen Bennett']/preceding-sibling::td/input[@ type='checkbox']")).click();
		sib.findElement(By.xpath("//td[text()='Yoshi Tannamuri']/preceding-sibling::td/input[@ type='checkbox']")).click();
		sib.findElement(By.xpath("//td[text()='Giovanni Rovelli']/preceding-sibling::td/input[@ type='checkbox']")).click();
		
	}

}
