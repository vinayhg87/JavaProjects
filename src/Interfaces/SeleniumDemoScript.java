package Interfaces;

import java.io.File;

public class SeleniumDemoScript {
	
	public static void main(String[] args) 
	{
		System.getProperty("webdriver.gecko.driver",".//Driver");
		WebDriver driver = new FireFoxDriver();//upcasting
		driver.get("https://www.google.com");
		/*RemoteWebDriver dr1 = new FireFoxDriver();
		dr1.close();
		dr1.Findelement();
		dr1.getCurrentUrl();*/
		
		driver = new ChromeDriver();//upcasting
		driver.getCurrentUrl();
		driver.close();
		driver.Findelement();		
		
		File scr = ((TakesScreenshot)driver).GetScreenShotAs();
		System.out.println(scr);
	}

}
