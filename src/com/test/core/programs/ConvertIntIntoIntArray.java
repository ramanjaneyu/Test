package com.test.core.programs;
/*
convert int i = 1234 into int[] array
output: [1, 2, 3, 4]
 */
public class ConvertIntIntoIntArray {
    public static void main(String[] args) {
        int r, n = 1234;

        while(n > 0){
            r = n % 10;
            n = n / 10;
            System.out.println(r);
            System.out.println(n);
        }
    }
}
