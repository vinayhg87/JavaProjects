package TakeScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class screenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException   
	{
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("moz:firefoxOptions", options);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VinayVinay\\Desktop\\Screenshot\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capabilities);
		
		driver.get("https://www.google.com");
		
		//Thread.sleep(5000);
		/* Takescreenshot */

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\VinayVinay\\Desktop\\Screenshot\\1.jpg"));
		
	}

}
