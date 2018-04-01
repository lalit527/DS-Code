package com.dataStructure.Assignment;

public class DigitAdd {
    public static void main(String[] args) {
        int num = 527;
        int sum = 0;
        while(num>0){
            sum = sum + num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
