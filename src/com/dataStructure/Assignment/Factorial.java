package com.dataStructure.Assignment;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        if(num > 1){
            for (int i = num; i > 1; i--) {
                factorial *= i;
            }
        }
        System.out.println(factorial);
    }
}
