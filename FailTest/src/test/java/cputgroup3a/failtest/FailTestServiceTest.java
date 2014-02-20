/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.failtest;

import org.testng.Assert;
import cputgroup3a.failtest.configuration.AppConfig;
import cputgroup3a.failtest.service.FailTestService;
import cputgroup3a.failtest.service.Impl.FailTestServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class FailTestServiceTest {
    
    public FailTestServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static FailTestService ft;
    
    @Test
    public static void testSendNum(){
        ft.sendNum(123);
        Assert.fail();
    }
    
    @Test
    public static void testSendMsg(){
        String carbon = "Deliberately failing the test";
        ft.sendMsg("Bees are the best insects ever");
        Assert.fail(carbon);
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ft = (FailTestService) ctx.getBean("FT"); 
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
