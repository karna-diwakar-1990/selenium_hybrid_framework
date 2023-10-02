package com.karna;

import org.testng.Assert;    
import org.testng.annotations.Test;

import com.karna.Utils.Logger.Log;
//@Listeners(com.karna.Listeners.TestListener.class)
public class Addition {
    
    @Test
    public void add(){
        int a = 10;
        int b = 10;
        Assert.assertEquals(a+b, 20);
    }    
}
