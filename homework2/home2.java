package part1.homework2;

import java.util.Scanner;

/**
 * Вычисление квадрата целой части......
 * @Author Ilnaz Sharafiev
 */
public class home2 {
    /**
     * Procedure main()
     */
    public static void main(String[] args){
        int[] rndArr = ArrList();
        findNumbers(rndArr);
    }

    /**
     * Array range [50;-50]
     * @return Array
     */
    public static int[] ArrList(){
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite razmer: ");
        int arrSize = input.nextInt();
        int[] rndNum = new int[arrSize];
        for(int i = 0; i < arrSize; i++){
            rndNum[i] = (int)((Math.random() * 100) - 50);
        }
        System.out.println("Array:");
        for(int num: rndNum){
            System.out.print(" " + num);
        }
        System.out.println();
        return rndNum;
    }

    /**
     * find Number
     * @param array Array
     */
    public static void findNumbers(int[] array){
        for(int key: array){
            Double value = Math.sqrt(key);
            if(value.isNaN()){
                throw new ArithmeticException("Error. Try again!");
            }
            else if(value.intValue() * value.intValue()  == value){
                System.out.println("q = " + value.intValue() + ", k = " + value);
            }
        }
    }
}
