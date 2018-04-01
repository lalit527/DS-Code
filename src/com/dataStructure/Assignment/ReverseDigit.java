package com.dataStructure.Assignment;

public class ReverseDigit {
    public static void main(String[] args) {
        int num = 527;
        int revNum = 0;
        while(num > 0){
            revNum = revNum * 10 + num % 10;
            num = num / 10;

        }
        System.out.println(revNum);
    }
}
