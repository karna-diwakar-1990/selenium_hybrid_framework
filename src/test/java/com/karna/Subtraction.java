package com.karna;

import org.testng.Assert;    
import org.testng.annotations.Test;

import com.karna.Utils.Logger.Log;
//@Listeners(com.karna.Listeners.TestListener.class)
public class Subtraction {
    
    @Test
    public void subtract(){
       
            int a = 20;
            int b = 20;
            Assert.assertEquals(a-b, 1);   
    }
    
}
