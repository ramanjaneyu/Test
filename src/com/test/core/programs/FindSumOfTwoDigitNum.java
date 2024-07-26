package com.test.core.programs;

/*
program to take an input of 2-digit number and extract the first and last digit and add them.
Input : 12
Output : 1 + 2 = 3
 */
public class FindSumOfTwoDigitNum {
    public static void main(String[] args) {
        findSum(12);

    }
    static void findSum(int input){
        if(input < 10 || input > 99){
            System.out.println("Invalid number");
        }else{
            int firstDigit = input/10;
            int lastDigit = input % 10;
            int sum = firstDigit + lastDigit;
            System.out.println("print result : " + sum);
        }
    }
}
