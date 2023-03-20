package com.bridgeLabz;

import org.testng.annotations.*;

public class OrderOfTestNG {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite---");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test---");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class---");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method---");
    }
    @Test(groups = "'CQA115")
    public void test1(){
        System.out.println("Test case 1---");
    }
    @Test
    public void test2() {
        System.out.println("Test case 2---");
    }
    @Test
    public void test3() {
        System.out.println("Test case 3---");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method---");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class---");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test---");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite---");
    }

}
