package com.test.core.programs;
/*
Program to check the given number is Fibonacci or not
Ex: 8 - Yes, 34 - Yes, 41 - No
Note: A number is Fibonacci if and only if one or both of (5*n*n + 4) or (5*n*n - 4) is a perfect square
 */
public class CheckTheGivenNumIsFibonacci {
    public static void main(String[] args) {
        //System.out.println(isFibonacci(34));
        System.out.println(isFibonacciWithoutFormula(34));
    }

    private static boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }
    private static boolean isPerfectSquare(int num){
        int result = (int) Math.sqrt(num);
        return (num == result * result);
    }
    private static boolean isFibonacciWithoutFormula(int num){
        int firstElement = 0, secondElement = 1, nextElement;
        while(true){
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
            System.out.println("NextElement is : " + nextElement);
            if(num == nextElement)
                return true;
            else if(nextElement > num)
                return false;
        }
    }
}
