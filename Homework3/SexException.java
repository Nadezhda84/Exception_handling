package Homework3;

public class SexException extends Exception{
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Некорректно введен пол: %s", i);
        System.out.println();
    }
}
