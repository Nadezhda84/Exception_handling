/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */
package Homework1;

public class Task_1 {
    public static void main(String[] args) {
        method_1();
        method_2();
        method_3();
        
    }

    public static void method_1(){
        int array[] = {1, 2, 3};
        try {
            System.out.println(array[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
    }

    public static void method_2(){
        int num_1 = 5;
        int num_2 = 0;
        try {
            num_1 = num_1/num_2;
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible!");
        }
    }

    public static void method_3(){
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
     
            System.out.println("Trying to get the length of a null string!");
        }
    }
}

