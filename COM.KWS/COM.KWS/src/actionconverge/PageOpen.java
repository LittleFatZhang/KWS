package actionconverge;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class PageOpen {
	public int open(String url,String webbrower)
	{
		switch(webbrower)
			{
				case "chrome":
					WebDriver driver = new ChromeDriver();
					driver.get(url);
				case "firefox":
					WebDriver driver1 = new FirefoxDriver();
					driver1.get(url);
				case "IE":
					WebDriver driver2 = new InternetExplorerDriver();
					driver2.get(url);
				default:
					System.out.println("Please choose the right Web Brower");
			}
		return 1;
	}
	public static void main(String[] args)
	{
		PageOpen hehe = new PageOpen();
		hehe.open("http://www.baidu.com","IE");
	}
}
