package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adacitin {
	
	public static void main(String[] args) throws InterruptedException  {
		
		ChromeDriver adt = new ChromeDriver ();
		adt.get("https://adactinhotelapp.com/");
		adt.findElement(By.xpath("//input[@name='username']")).sendKeys("Balaji10045");
		adt.findElement(By.xpath("//input[@name='password']")).sendKeys("abc12345");
		adt.findElement(By.xpath("//input[@name='login']")).click();
		
		Select loc=new Select(adt.findElement(By.xpath("//select[@name='location']")));
		loc.selectByValue("Sydney");
		Select htl=new Select(adt.findElement(By.xpath("//select[@name='hotels']")));
		htl.selectByValue("Hotel Creek");
		Select rmt=new Select(adt.findElement(By.xpath("//select[@name='room_type']")));
		rmt.selectByValue("Standard");
		Select rno=new Select(adt.findElement(By.xpath("//select[@name='room_nos']")));
		rno.selectByVisibleText("1 - One");
		
		
		//adt.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("02/09/2025");
		//adt.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("05/09/2025");
		
		Select adr=new Select(adt.findElement(By.xpath("//select[@name='adult_room']")));
		adr.selectByVisibleText("1 - One");
		Select chd=new Select(adt.findElement(By.xpath("//select[@name='child_room']")));
		chd.selectByVisibleText("1 - One");
		
		adt.findElement(By.xpath ("//input[@type='submit']")).click();
		adt.findElement(By.xpath ("//input[@name='radiobutton_0']")).click();
		adt.findElement(By.xpath ("//input[@value='Continue']")).click();
		
		adt.findElement(By.xpath ("//input[@name='first_name']")).sendKeys("Ramesh");
		adt.findElement(By.xpath ("//input[@name='last_name']")).sendKeys("Kumar");
		adt.findElement(By.xpath ("//textarea[@name='address']")).sendKeys("Chennai");
		adt.findElement(By.xpath ("//input[@name='cc_num']")).sendKeys("0123456789123456");
		Select cty=new Select(adt.findElement(By.xpath("//select[@name='cc_type']")));
		cty.selectByVisibleText("American Express");
		Select epm=new Select(adt.findElement(By.xpath("//select[@name='cc_exp_month']")));
		epm.selectByVisibleText("October");
		Select epy=new Select(adt.findElement(By.xpath("//select[@name='cc_exp_year']")));
		epy.selectByVisibleText("2025");
		adt.findElement(By.xpath ("//input[@name='cc_cvv']")).sendKeys("1458");
		adt.findElement(By.xpath ("//input[@Value='Book Now']")).click();
		
		Thread.sleep(5000);
		adt.findElement(By.xpath ("//input[@name='logout']")).click();
		
	
		
		
		
		
		
		
	}

}
