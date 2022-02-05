package week.leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.xpath("//img[@src='images/image.png']")).click();
		String Attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("onclick");
		if (Attribute == null) {
			System.out.println("The image is broken");
		}
		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	}

}
