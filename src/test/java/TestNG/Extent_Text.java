package TestNG;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Text implements ITestListener{
	public ExtentSparkReporter ESR;    //UI report
	public ExtentReports EReport;   //common info report
	public ExtentTest ETest;    //entry data into report
	
	public void onStart(ITestContext context) {
		//set the Location of folder
		ESR=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Taskgator.html"); //get 
		ESR.config().setDocumentTitle("Automation testing");
		ESR.config().setReportName("SwagLabs Test");                  //set
		ESR.config().setTheme(Theme.STANDARD);
		
		//Common Info
		EReport =new ExtentReports();
		EReport.attachReporter(ESR);
		EReport.setSystemInfo("Maven", "Eclipse");
		EReport.setSystemInfo("Tester","Suri");
		EReport.setSystemInfo("OS", "Windows 11");
		EReport.setSystemInfo("Browser", "Chrome");
		
	}
	public void onTestSuccess(ITestResult result) {
		ETest=EReport.createTest(result.getName());//Creating a Entry in Report
		ETest.log(Status.PASS, "Test is Passed:"+result.getName());//Update the Info in the Report
		System.out.println("Test is Passed");
	}
	public void onTestFailure(ITestResult result) {
		ETest=EReport.createTest(result.getName());
		ETest.log(Status.FAIL, "Test is failed:"+result.getName());
		ETest.log(Status.FAIL, "Test is failed:"+result.getThrowable());//reason for failure
	}
	public void onTestSkipped(ITestResult result) {
		ETest=EReport.createTest(result.getName());
		ETest.log(Status.SKIP, "Test is skipped:"+result.getName());
		ETest.log(Status.SKIP, "Test is skipped:"+result.getThrowable());
	}
	public void onFinish(ITestContext context) {
		EReport.flush();
	}

}
