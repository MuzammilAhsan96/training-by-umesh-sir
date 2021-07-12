package com.example.myapp.umeshsir.exceptionpkg;

public class Exceptmuz {
    public static void main(String[] args) {
        int i=0;
        try {
            int t=10/i;
            System.out.println(t);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
        }
        System.out.println(("hi"));


    }
}
