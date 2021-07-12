package com.example.myapp.umeshsir.exceptionpkg;

public class MainException {
    public void validate(int age) throws CustomeException
    {
        if(age>18)
        {
            throw new CustomeException("Age is not valid");
        }
        else
        {
            System.out.println("Age valid");
        }
    }
    public static void main(String[] args) {
        MainException ob=new MainException();
        try {
            ob.validate(19);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
