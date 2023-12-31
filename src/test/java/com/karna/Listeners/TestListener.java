package com.karna.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.karna.Utils.Logger.Log;

public class TestListener implements ITestListener {
 
    @Override
    public void onTestStart(ITestResult iTestResult) {
        Log.info("I am in onTestStart method " +  getTestMethodName(iTestResult) + " start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Log.info("I am in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        Log.error("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Log.info("I am in onTestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        Log.info("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Log.info("I am in onStart method " + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method " + iTestContext.getName());
    }

    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
}
