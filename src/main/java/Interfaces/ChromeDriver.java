package Interfaces;

import java.io.File;

public class ChromeDriver extends RemoteWebDriver {
	
	@Override
	public String get(String URL) {
		System.out.println("get() of ChromeDriver");
		return null;	
	}
	
	@Override
	public void getTitle() {
		System.out.println("getTitle() of ChromeDriver");	
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("getCurrentUrl() of ChromeDriver");	
	}

	@Override
	public void getPageSource() {
		System.out.println("getPageSource() of ChromeDriver");		
	}

	@Override
	public void Switchto() {
		System.out.println("Switchto() of ChromeDriver");		
	}

	@Override
	public void quit() {
		System.out.println("quit() of ChromeDriver");		
	}

	@Override
	public void close() {
		System.out.println("close() of ChromeDriver");
	}

	@Override
	public void getwindowHandle() {
		System.out.println("getwindowHandle() of ChromeDriver");
	}

	@Override
	public void getwindowHandles() {
		System.out.println("getwindowHandles() of ChromeDriver");
	}

	@Override
	public void navigate() {
		System.out.println("navigate() of ChromeDriver");
	}

	@Override
	public void manage() {
		System.out.println("manage() of ChromeDriver");		
	}

	@Override
	public void Findelement() {
		System.out.println("Findelement() of ChromeDriver");		
	}

	@Override
	public void Findelements() {
		System.out.println("Findelements() of ChromeDriver");		
	}

	@Override
	public File GetScreenShotAs() {
		System.out.println("GestScreenShotAs() of ChromeDriver");
		return null;		
	}

	@Override
	public void ExecuteJavaScript() {
		System.out.println("ExecuteJavaScript() of ChromeDriver");	
	}
}
