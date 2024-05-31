package WWproduct.testCases;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import WWproduct.utilities.ReadConfig;

public class BaseClassTest {
	
	ReadConfig readconfig;
		
	 public static WebDriver driver;
	 String Downloadfile=System.getProperty("user.dir")+ "\\DownloadExcel\\";
	 ChromeOptions chromeOptions = new ChromeOptions();
	 
		@Parameters("Browser")
		@BeforeClass
		public void setup(String Browser)
		{	
			readconfig=new ReadConfig();
			HashMap<String,Object>chromeprefs=new HashMap<String, Object>();
			chromeprefs.put("profile.default_content_settings.popups",0);
			chromeprefs.put("download.default_directory",Downloadfile);
			chromeOptions.setExperimentalOption("prefs",chromeprefs);
		
			String browserName=readconfig.getbrowser(); //!=null ? System.getProperty("browser"):System.getProperty("browser");
			
			if(browserName.contains("Chrome"))
			{
			
				//System.setProperty("webdriver.chrome.driver",readconfig.getbrowser());
				 //ChromeOptions chromeOptions = new ChromeOptions();
				 chromeOptions.addArguments("--remote-allow-origins=*");
				  driver = new ChromeDriver(chromeOptions);
				  
				  
			}
			else if(Browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
				driver = new FirefoxDriver();
			}
			else if(Browser.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
				driver = new InternetExplorerDriver();
			}
			
			
			driver.manage().window().maximize();
			
			
			
			
		}
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		public void captureScreen(WebDriver driver, String tname) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File target = new File(System.getProperty("user.dir") + "\\screenshotFolder\\" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
		
		
		 }

