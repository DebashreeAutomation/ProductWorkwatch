package WWproduct.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import WWproduct.pageObjects.TestuserLoginpage;
import WWproduct.utilities.ReadConfig;

public class Verify_outlookactionTest {
	ReadConfig readconfig;
	 public String outlookURL;
	 
	 
	public void logintoOutlook() throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\p50038542\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		 WebDriver driver3 = new EdgeDriver();       
		 driver3.manage().window().maximize(); 
		 driver3.get("https://outlook.office.com/");  
		 driver3.manage().deleteAllCookies(); Thread.sleep(2500);
			Thread.sleep(2000);
			TestuserLoginpage outlooklogin=new TestuserLoginpage(driver3);
			outlooklogin.enterCIASINTmailid();
			Thread.sleep(2000);
			outlooklogin.enternextbtn();
			Thread.sleep(2000);
			outlooklogin.enterCIASINTpswd();
			Thread.sleep(2000);
			outlooklogin.signin();
	}

}
