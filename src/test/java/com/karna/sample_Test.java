package com.karna;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample_Test {

    @Test
    public void add(){
        int a = 10;
        int b = 10;
        Assert.assertEquals(a+b, 20);
    }

    @Test
    public void subtract(){
        int a = 20;
        int b = 20;
        Assert.assertEquals(a-b, 0);
    }
    
}
