package Interfaces;

public interface WebDriver extends SearchContext {
	
	public String get(String URL);
	public void getTitle();
	public void getCurrentUrl();
	public void getPageSource();
	public void Switchto();
	public void quit();
	public void close();
	public void getwindowHandle();
	public void getwindowHandles();
	public void navigate();
	public void manage();
	public void Findelement();
	public void Findelements();

}
