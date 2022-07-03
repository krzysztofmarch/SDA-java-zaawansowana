package com.sda.exceptons;

public class ExceptionTest {
    public static void main(String[] args) {


        int[] myArray = {1, 2, 3, 4, 5};
        String someWord = null;

        try {
            int someNumber = myArray[7];
            //someWord.length();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exception){
            System.out.println("Wystapil blad");
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
            System.out.println(exception.getCause());
        } finally {
            System.out.println("Ten blok wykona sie zawsze\n\n");
        }

        try {
            int someNumber = myArray[7];
            someWord.length();
        } catch (Exception exception){
            System.out.println("Wystapil blad");
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
            System.out.println(exception.getCause());
        } finally {
            System.out.println("Ten blok wykona sie zawsze\n\n");
        }


        Divider divider = new Divider();
        int result = 0;
        try {
            result = divider.divide(14, 0);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(result);




    }
}
