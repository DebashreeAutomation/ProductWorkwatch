package WWproduct.testCases;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import WWproduct.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig;
		
	 public static WebDriver driver;
	 String Downloadfile=System.getProperty("user.dir")+ "\\DownloadExcel\\";
	 ChromeOptions chromeOptions = new ChromeOptions();
	 
		@Parameters("browser")
		@BeforeClass
		public void setup(String br)
		{	
		    File path = new File(Downloadfile);
		    File[] files = path.listFiles();
		    for (File file : files) {
		        System.out.println("Deleted filename :"+ file.getName());
		        file.delete();
		    }
			readconfig=new ReadConfig();
			HashMap<String,Object>chromeprefs=new HashMap<String, Object>();
			chromeprefs.put("profile.default_content_settings.popups",0);
			chromeprefs.put("download.default_directory",Downloadfile);
			chromeOptions.setExperimentalOption("prefs",chromeprefs);
			
			
			if(br.equals("chrome"))
			{
			
				System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
				 //ChromeOptions chromeOptions = new ChromeOptions();
				 chromeOptions.addArguments("--remote-allow-origins=*");
				  driver = new ChromeDriver(chromeOptions);
				  
				  
			}
			else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
				driver = new FirefoxDriver();
			}
			else if(br.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
				driver = new InternetExplorerDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
			
			
		}
		
		@AfterTest
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
		
		public String randomestring()
		{
			String generatedstring=RandomStringUtils.randomAlphabetic(8);
			return(generatedstring);
		}
		
		public static String randomeNum() {
			String generatedString2 = RandomStringUtils.randomNumeric(4);
			return (generatedString2);
		}
		
		
		 }

