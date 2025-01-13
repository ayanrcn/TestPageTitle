package app;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class App_One {
	private WebDriver driver;
		// TODO Auto-generated method stub
	public App_One() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Ayan Banerjee/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
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
