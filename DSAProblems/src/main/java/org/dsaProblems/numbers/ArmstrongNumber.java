package org.dsaProblems.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        armstrongNumberCheck(num);
    }

    private static void armstrongNumberCheck(int num) {
        int digit=0;
        int temp=num;
        int result=0;
        while(temp>0){
            digit=temp%10;
            result= (int) (result+Math.pow(digit,3));
            temp=temp/10;
        }
        String state=(result==num)?"Given num is a armstrong number":"Given num is not armstrong number";
        System.out.println("Answer: "+state);
    }
}
