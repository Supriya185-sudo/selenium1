package Com.Crm.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Com.Crm.BaseClass.BaseClassDWSPage;

public class DWSPageExtentReport implements ITestListener {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		spark=new ExtentSparkReporter(".\\src\\main\\resources\\TestCase.html");
		spark.config().setDocumentTitle("Task1");
		spark.config().setReportName("Supriya");
		spark.config().setTheme(Theme.DARK);
		
		//Create Extent Report
		report=new ExtentReports();
		report.setSystemInfo("OS", "Linux");
		report.setSystemInfo("Browser", "Chrome");
		
		//Attach Report to spark
		report.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

}
