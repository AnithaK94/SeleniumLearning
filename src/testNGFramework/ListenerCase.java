package testNGFramework;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerCase implements ITestListener {
    /*Listeners -TestNG provides the @Listeners annotation which listens to every event that occurs in a selenium code.
      Listeners are activated either before the test or after the test case.
      It is an interface that modifies the TestNG behavior.
      For example, when you are running a test case either through selenium or appium and suddenly a test case fails.
      We need a screenshot of the test case that has been failed, to achieve such scenario, TestNG provides a mechanism, i.e., Listeners.
      When the test case failure occurs, then it is redirected to the new block written for the screenshot.*/
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The Test case is going to be Executed");
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case is Passed");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case is Failed");
    }
    @Override

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Case is Skipped");
    }
    @Override

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Before Everything");
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("After Everything");
    }
}
