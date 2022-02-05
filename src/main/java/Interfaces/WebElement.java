package Interfaces;

public interface WebElement extends TakesScreenshot, SearchContext {
	
	public void sendkeys();
	public void click();
	public void getText();
	public void isSelected();
	public void isenabled();
}
