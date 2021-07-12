package com.example.myapp.umeshsir.exceptionpkg;

public class TestThrowThrows {
    public int quotient1(int a,int b) throws ArithmeticException
    {
        int t=a/b;
        return t;
    }
    public int quotient2(int a, int b)
    {
        int t=0;
        if(b==0)
        {
            throw new ArithmeticException("Can't divide by zero");
        }
        else
        {
            t=a/b;
        }
        return t;
    }

    public static void main(String[] args) {
        TestThrowThrows ob=new TestThrowThrows();
        int a=0,b=0;
        try {
            a=ob.quotient1(10,0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            b=ob.quotient2(10,0);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(a+"   "+b);
    }
}
