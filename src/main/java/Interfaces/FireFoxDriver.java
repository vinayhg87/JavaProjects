package Interfaces;

import java.io.File;

//FirefoxDriver extends RemoteWebDriver implements WebStorage, HasExtensions (real implementation)

public class FireFoxDriver extends RemoteWebDriver {
	
	@Override
	public String get(String URL) {
		System.out.println("get() of FireFoxDriver");
		return null;	
	}	
	
	@Override
	public void getTitle() {
		System.out.println("getTitle() of FireFoxDriver");	
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("getCurrentUrl() of FireFoxDriver");	
	}

	@Override
	public void getPageSource() {
		System.out.println("getPageSource() of FireFoxDriver");		
	}

	@Override
	public void Switchto() {
		System.out.println("Switchto() of FireFoxDriver");		
	}

	@Override
	public void quit() {
		System.out.println("quit() of FireFoxDriver");		
	}

	@Override
	public void close() {
		System.out.println("close() of FireFoxDriver");
	}

	@Override
	public void getwindowHandle() {
		System.out.println("getwindowHandle() of FireFoxDriver");
	}

	@Override
	public void getwindowHandles() {
		System.out.println("getwindowHandles() of FireFoxDriver");
	}

	@Override
	public void navigate() {
		System.out.println("navigate() of FireFoxDriver");
	}

	@Override
	public void manage() {
		System.out.println("manage() of FireFoxDriver");		
	}

	@Override
	public void Findelement() {
		System.out.println("Findelement() of FireFoxDriver");		
	}

	@Override
	public void Findelements() {
		System.out.println("Findelements() of FireFoxDriver");		
	}

	@Override
	public File GetScreenShotAs() {
		System.out.println("GestScreenShotAs() of FireFoxDriver");
		return null;		
	}

	@Override
	public void ExecuteJavaScript() {
		System.out.println("ExecuteJavaScript() of FireFoxDriver");		
	}
}
