package app;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class App_One {
	private WebDriver driver;
		// TODO Auto-generated method stub
	public App_One() {
		this.driver = new ChromeDriver();
	}
		//System.out.println("Helo this is my first maven app");
		public void openWeb(String url) {
			driver.get(url);
		}
		public String getPageTitle() {
			return driver.getTitle();
		}
		
}
