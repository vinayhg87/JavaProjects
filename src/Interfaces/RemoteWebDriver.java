package Interfaces;

import java.io.File;

public class RemoteWebDriver implements WebDriver, TakesScreenshot, JavaScriptExecutor {

	@Override
	public String get(String URL) {
		System.out.println("get()");
		return null;	
	}

	@Override
	public void getTitle() {
		System.out.println("getTitle()");		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("getCurrentUrl()");	
	}

	@Override
	public void getPageSource() {
		System.out.println("getPageSource()");		
	}

	@Override
	public void Switchto() {
		System.out.println("Switchto()");		
	}

	@Override
	public void quit() {
		System.out.println("quit()");		
	}

	@Override
	public void close() {
		System.out.println("close()");		
	}

	@Override
	public void getwindowHandle() {
		System.out.println("getwindowHandle()");		
	}

	@Override
	public void getwindowHandles() {
		System.out.println("getwindowHandles()");		
	}

	@Override
	public void navigate() {
		System.out.println("navigate()");		
	}

	@Override
	public void manage() {
		System.out.println("manage()");		
	}

	@Override
	public void Findelement() {
		System.out.println("Findelement()");		
	}

	@Override
	public void Findelements() {
		System.out.println("Findelements()");		
	}


	@Override
	public void ExecuteJavaScript() {
		System.out.println("ExecuteJavaScript()");		
	}

	@Override
	public File GetScreenShotAs() {
		// TODO Auto-generated method stub
		return null;
	}

}
