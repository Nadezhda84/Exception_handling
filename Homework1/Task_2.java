/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. */
package Homework1;

public class Task_2 {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {1, 10, 3};
        int[] arr2 = {2, 8, 15, 0};
        diffArray(arr1, arr2);
        
    }

    public static void diffArray(int[] arr1, int[] arr2) throws Exception{
        if (arr1.length !=arr2.length){
            throw new Exception("Array lengths do not match!");
        }
        else{
            int[] newArr = new int[arr1.length];
            for(int i=0; i < arr1.length; i++){
                newArr[i]=arr1[i]-arr2[i];
                System.out.print(newArr[i]+" ");
            }
        }
    }
}
