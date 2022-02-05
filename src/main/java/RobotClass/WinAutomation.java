package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WinAutomation {
	
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver  = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.MINUTES);
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/..//*[contains(text(),'Download')]")).click();
		//OR// driver.findElement(By.xpath("//*[text()='Java']//parent::tr//*[contains(text(),'Download')]")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
