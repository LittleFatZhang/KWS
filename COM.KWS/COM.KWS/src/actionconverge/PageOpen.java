package actionconverge;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class PageOpen {
	public int open(String url,String webbrower)
	{
		try
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
					System.out.println("����������д����ȷ����������ƣ�����:chrome,firefox,IE��");
			}
		}
		catch(IllegalStateException e)
		{
			//e.printStackTrace();
			System.out.println("��ȷ��ӵ�ж�Ӧ�������Selenium������");
		}
		catch(WebDriverException e2)
		{
			//e2.printStackTrace();
			System.out.println("��ȷ�ϰ�װ�˶�Ӧ���������");
		}
		return 1;
	}
	public static void main(String[] args)
	{
		PageOpen hehe = new PageOpen();
		hehe.open("http://www.baidu.com","firefox");
	}
}
