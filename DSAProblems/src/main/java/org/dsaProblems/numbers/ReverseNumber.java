package org.dsaProblems.numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int reverseNum=reverseNumber(num);
        System.out.println("ReverseNumber: "+reverseNum);
       String state= (num==reverseNum)?"num is palindrome":"Number is not a palindrome";
        System.out.println("check for palindrome: "+ state);
    }

    private static int reverseNumber(int num) {
        int temp=num;
        int reverseNum=0;
        while(temp>0){
            reverseNum=reverseNum*10+(temp%10);
            temp=temp/10;
        }
        return reverseNum;
    }
}
