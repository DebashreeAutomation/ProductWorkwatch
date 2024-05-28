package WWproduct.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting extends TestListenerAdapter{
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest logger;

	public void onStart(ITestContext testContext)
	{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
		sparkReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-config.xml");

		sparkReporter.config().setDocumentTitle("WWProductAutomation"); 
		sparkReporter.config().setReportName("Functional Test Automation Report"); 
		//sparkReporter.config().setTestViewChartLocation(ChartLocation.TOP); 
		sparkReporter.config().setTheme(Theme.DARK);
        extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Project name","WWProductAutomation");
		extent.setSystemInfo("Host name","localhost");
		extent.setSystemInfo("Environemnt","QA");
		extent.setSystemInfo("Tester","debashree");
		
		sparkReporter.config().setDocumentTitle("WWProductAutomation"); 
		sparkReporter.config().setReportName("Functional Test Automation Report"); 
		//sparkReporter.config().setTestViewChartLocation(ChartLocation.TOP); 
		sparkReporter.config().setTheme(Theme.DARK);
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); 
		logger.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN)); 
	}
	
	public void onTestFailure(ITestResult tr)
	{
	logger=extent.createTest(tr.getName()); 
	logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
	
	String screenshotsPath=System.getProperty("user.dir")+"/screenshotFolder/"+tr.getName()+".png";
	
	File f = new File(screenshotsPath); 
	
	if(f.exists())
	{
	try {
		logger.fail("Screenshot is below:" + logger.addScreenCaptureFromPath(screenshotsPath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); 
		logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}


}
