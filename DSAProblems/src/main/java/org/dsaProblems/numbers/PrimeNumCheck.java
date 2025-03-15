package org.dsaProblems.numbers;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        boolean check=checkForPrime(num);
        String result=check?"Yes given no is a prime Number ":"No given no is not a prime Number ";
        System.out.println(result+ num);
    }

    private static boolean checkForPrime(int num) {
        int count=2; // count is 2 bcz number get divided by 1 & itself
        for (int i=2;i*i<=num;i++){
            if(num%2==0)
                count++;
        }
        if(count==2)
            return true;
        else
            return false;
    }
}
