package week.leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(",a text has been appended", Keys.TAB);
		String Attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("Default text is " + Attribute);
		driver.findElement(By.xpath("//input[@value = 'Clear me!!']")).clear();
		driver.findElement(By.xpath("(//input[@type= 'text'])[5]")).isEnabled();
		if (driver.findElement(By.xpath("(//input[@type= 'text'])[5]")).isEnabled() == true) {
			System.out.println("The text box is enabled");
		} else
			System.out.println("The text box is Disabled");
	}

}
