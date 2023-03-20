package com.bridgeLabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesAttribution {

    @Test(groups = "CQA115")
    public void createUser(){
       Assert.assertTrue(true,"create user test");
    }
    @Test(groups = "CQA115")
    public void deleteUser(){
        System.out.println("deleted user sucsefully---");
    }
    @Test()
    public void tempTest(){
        System.out.println("temp Test");
    }
}
