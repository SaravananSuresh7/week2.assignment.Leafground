package week.leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		System.out.println("Homepage is: " +driver.getTitle());
		driver.findElement(By.xpath("//a[@href = 'pages/Button.html']")).click();
		System.out.println("Position of Button is " + driver.findElement(By.id("position")).getLocation());
		System.out.println("Color of button is " + driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println("Size of button is " + driver.findElement(By.id("size")).getSize());
		driver.close();
	}

}
