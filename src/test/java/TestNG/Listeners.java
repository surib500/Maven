package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start");
	}
	public void onTestSucess(ITestResult result) {
		System.out.println("Test Sucess");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("On test failure...");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped...");
	}
	public void onFinish(ITestContext context) {
		System.out.println("On test finish...");
	}
}
