package com.junitIntegration;

import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calcService;

    @Test
    public void testAdd(){
        //add the behavior of calc service to add two numbers
        when(calcService.add(10.0,20.0)).thenReturn(30.00);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
    }

    @Test
    public void testSub(){
        //add the behavior of calc service to add two numbers
        when(calcService.subtract(10.0,20.0)).thenReturn(-10.0);

        //test the add functionality
        Assert.assertEquals(mathApplication.subtract(10.0, 20.0),-10.0,0);
    }

    @Test
    public void testMultiply(){
        //add the behavior of calc service to add two numbers
        when(calcService.multiply(10.0,20.0)).thenReturn(300.0);

        //test the add functionality
        Assert.assertEquals(mathApplication.multiply(10.0, 20.0),300.0,0);
    }

    @Test
    public void testDivide(){
        //add the behavior of calc service to add two numbers
        when(calcService.divide(10.0,20.0)).thenReturn(30000.0);

        //test the add functionality
        Assert.assertEquals(mathApplication.divide(10.0, 20.0),30000.0,0);
    }
}
