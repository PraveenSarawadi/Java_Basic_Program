package com.practice.Array.PracticePrograms.Day2;

import java.util.Scanner;

public class NeetCode1 {
    public static void main(String[] args) {
//        Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//          Input: nums = [1, 2, 3, 3]
//        Output: true
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements of an array");
        int arraySize = sc.nextInt();
        int[] inputArr = new int[arraySize];
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }

        for (int i = 0; i < inputArr.length; i++) {
            for(int j=i+1;j<inputArr.length;j++){
                if(inputArr[i]==inputArr[j]){
                    flag=true;
                }
            }
        }
        if(flag)
            System.out.println("yes the array has duplicates:!!!");
        else
            System.out.println("Array has unique elements");


    }
}
