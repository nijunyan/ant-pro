package com.test.junit;

import org.junit.Before;  
import org.junit.Test;

import com.testsrc.junit.Calculator;

import static org.junit.Assert.*;  
  
public class CalculatorTest  
{  
    private Calculator cal;  
    @Before  
    public void setUp() throws Exception  
    {  
        cal = new Calculator();  
    }  
  
    @Test  
    public void testAdd()  
    {  
        assertEquals("���", 5, cal.add(2, 3));  
    }  
  
    @Test  
    public void testSubstact()  
    {  
        assertEquals("���", -1, cal.substact(2, 3));  
    }  
  
    @Test  
    public void testMutilfy()  
    {  
        assertEquals("���", 6, cal.mutilfy(2, 3));  
    }  
  
    @Test  
    public void testDivid()  
    {  
        assertEquals("���", 2, cal.divid(6, 3));  
    }  
    @Test(expected=RuntimeException.class)  
    public void testDividByZero()  
    {  
        assertEquals("�쳣", -1, cal.divid(3, 0));  
    }  
  
}  

