import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowactions {

	public static void main(String[] args) 
	{
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize(); 
		a.get("https://google.com");
		a.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		a.navigate().back();
		a.navigate().forward();
	}

}
