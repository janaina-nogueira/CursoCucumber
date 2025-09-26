import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAmbiente {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Janaina\\Downloads\\chromedriver-win64\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
	}
}
