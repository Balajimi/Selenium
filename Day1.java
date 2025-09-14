package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day1 {

	public static void main(String[] args) {
	ChromeDriver apple = new ChromeDriver();
	apple.manage().window().maximize();
	apple.get("https://demo.guru99.com/V4/");
	

	}

}
