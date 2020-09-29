package com.example.digitCOunt;

import java.util.Scanner;

public class NoOfDigitInANo {

    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int N = sc.nextInt();
        int count =0;

        if (N==0 || N/10==0){
            count = count++;
            System.out.println(count);
        }
        else {
            while (N!=0){
                N = N/10;
                count++;
            }
            System.out.println(count);
        }



    }*/

    static int countDigit (long N){
        return (int)Math.floor(Math.log10(N)+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int N = sc.nextInt();
        System.out.println("The number of digits:"+ countDigit(N));

    }
}
