package com.techproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @Test
    public void Test1(){
        System.out.println("Test1 calisti");
    }

    @Before
    public void methoddanOnce(){
        System.out.println("methoddanOnce calisti");
    }

    @After
    public void methoddanSonra(){
        System.out.println("methoddanSonra calisti");
    }

    @Test
    public void Test2(){
        System.out.println("Test2 calisti");
    }


    @BeforeClass
    public static void setUp(){
        System.out.println("SetUp calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");
    }
}
