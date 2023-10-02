package com.karna.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.karna.Utils.Logger.Log;

public class SuiteListener implements ISuiteListener{
    @Override
    public void onStart(ISuite suite) {
        // When <suite> tag starts
        Log.info("Executing " + suite.getName() + " started");
    }

    @Override
    public void onFinish(ISuite suite) {
        // When <suite> tag completes
        Log.info("Executing " + suite.getName() + " finished");
    }
}
