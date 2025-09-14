package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	public static void main(String[] args) {
		
		ChromeDriver cal = new ChromeDriver();
		cal.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		cal.findElement(By.xpath("//input[@id='datepicker']")).click();
		String month = cal.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		
		String year = cal.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();		
		while(!(month.equals("October")&&year.equals("2025"))) {
			cal.findElement(By.xpath("//span[text()='Next']")).click();
			 month = cal.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		
			 year = cal.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	
			 
		}
		cal.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='1']")).click();
	}

}
