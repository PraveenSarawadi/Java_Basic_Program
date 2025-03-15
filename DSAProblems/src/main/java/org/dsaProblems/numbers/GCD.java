package org.dsaProblems.numbers;

import java.util.Scanner;

import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd= findGCD(a,b);
        System.out.println("GCD is: "+gcd);
    }
//following logic is based on Euclidean Algorithm
/* "It's based on the principle that the GCD of two numbers does not change if the larger number
    is replaced by its difference with the smaller 1  number till u get 0"
 */
    private static int findGCD(int a, int b) {
        if(a==0)
            return b;
        else if(b==0)
            return a;
        if(a>b) {
          return  findGCD(b, a % b);
        }
        else
           return findGCD(a,b%a);

    }
}
