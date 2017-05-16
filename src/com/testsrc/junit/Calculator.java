package com.testsrc.junit;  
  
public class Calculator  
{  
    public int add(int a, int b)  
    {  
        return a+b;  
    }  
    public int substact(int a, int b)  
    {  
        return a-b;  
    }  
    public int mutilfy(int a, int b)  
    {  
        return a*b;  
    }  
    public int divid(int a, int b)  
    {  
        if(b == 0)  
            throw new RuntimeException("/ by zero");  
        return a/b;  
    }  
    public String toString()  
    {  
        return this.getClass().getName()+"@"+this.hashCode();  
    }  
      
}  