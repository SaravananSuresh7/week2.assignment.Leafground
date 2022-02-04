package week.leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		String Attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href");
		System.out.println("Iam supposed to go to:" + Attribute);
		driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String S1 = driver.getTitle();
		System.out.println("Title is " + S1);
		String S2 = "404";
		if (S1.contains(S2)) {
			System.out.println("The link is broken");
		} else
			System.out.println("The link is working");
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//a[@href = '../home.html']")).click();
		driver.findElement(By.xpath("//a[@href = 'pages/Link.html']")).click();
		int num = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links available in this page is: " + num);

	}
}
