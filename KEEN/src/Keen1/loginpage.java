package Keen1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = null;

		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/jaypatel/git/QASM4/QASM4/src/keenexpert/config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("safari")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("IE")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		} else {
			System.out.println("no browser velu is given");
		}
		driver.get(prop.getProperty("url"));

		driver.findElement(By.id("txtusername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtpwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//i[@class='zmdi zmdi-menu']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//body/div[@id='layout']/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[contains(text(),'Reset password')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("txtEmail")).sendKeys("pateljimmy21@gmail.com");

		Thread.sleep(2000);

		driver.quit();

	}

}
