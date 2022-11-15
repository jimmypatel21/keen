package Keen1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationClient{

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
		driver.findElement(By.xpath("//a[@href='/signUp.aspx']")).click();
		Thread.sleep(1000);
		//a[contains(text(),'Register')]
		Select Select1 = new Select(driver.findElement(By.id("ddlUserType")));
		Select1.selectByVisibleText("Industry");
		Thread.sleep(1000);
		
		driver.findElement(By.id("txtFullName")).sendKeys("pateljimmy");
		driver.findElement(By.id("txtmail")).sendKeys("pateljimmy21@gmail.com");
		driver.findElement(By.id("rbMale")).isSelected();
		driver.findElement(By.id("txtMob")).sendKeys("9902204789");
		driver.findElement(By.id("rbMale")).isSelected();
		driver.findElement(By.id("txtDOB")).click();
		Thread.sleep(1000);

		Select Select = new Select(
				driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		Select.selectByVisibleText("Jun");

		Select Select2 = new Select(
				driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		Select2.selectByVisibleText("1989");

		driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("txtAddress1")).sendKeys("302,classic Meadows Apartment");
		driver.findElement(By.id("txtAddress2")).sendKeys("17th cross,5 th phase ,Jp nagar");

		Select Select3 = new Select(driver.findElement(By.id("ddlState")));
		Select3.selectByVisibleText("Karnataka");
		Thread.sleep(1000);

		Select Select4 = new Select(driver.findElement(By.id("ddlDist")));
		Select4.selectByVisibleText("Bangalore Urban");
		Thread.sleep(1000);

		Select Select5 = new Select(driver.findElement(By.id("ddlCity")));
		Select5.selectByVisibleText("Bangalore South");
		Thread.sleep(1000);

		driver.findElement(By.id("txtPinCode")).sendKeys("560078");

		driver.findElement(By.id("btnDocs")).click();
		Thread.sleep(1000);
                                                                    
		Select Select6 = new Select(driver.findElement(By.id("ddlClientDocType1")));
		Select6.selectByVisibleText("Aadhar Card");
		Thread.sleep(1000);

		Select Select7 = new Select(driver.findElement(By.id("ddlClientDocType2")));
		Select7.selectByVisibleText("PAN Card");
		Thread.sleep(2000);
		
		driver.findElement(By.id("fuClientDoc1")).sendKeys("//Users//jaypatel//Desktop//IMG_3872.jpg");
		Thread.sleep(2000);
		
		driver.findElement(By.id("fuClientDoc2")).sendKeys("/Users//jaypatel//Desktop//IMG_3891.jpg");
		Thread.sleep(2000);

		// driver.findElement(By.id("btnSignUp")).click();

		driver.quit();

	}

}
