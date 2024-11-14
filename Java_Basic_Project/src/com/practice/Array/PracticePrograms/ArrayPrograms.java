package com.practice.Array.PracticePrograms;

import java.util.*;

class Day1Programs{
    public int[] largestAndSmallestNumber(int[] inputArr){
        try {

            int[] outputArr=new int[2];
            Arrays.sort(inputArr);
            outputArr[0]=inputArr[0];
            outputArr[1]=inputArr[inputArr.length-1];
            return outputArr;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Object missingNumber(int[] inputArr) {
        try {
//            find total sum of all elements +missing no from array ie toatal sum of 1st n numbers below code is only for natural numbers
            int totalElements=inputArr.length+1;
            int totalSum=(totalElements*(totalElements+1))/2;
            int arraySum=0;
            for (int i:inputArr){
                arraySum+=i;
            }

            return totalSum-arraySum;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class ArrayPrograms {

    public static void main(String[] args) {
//        1. Find the Largest and Smallest Element in an Array
//        Write a Java program that finds the largest and smallest elements in a given array of integers.
//
//                Example Input:
//        arr = [1, 3, -5, 8, 0, 4]
//
//        Example Output:
//        Largest: 8
//        Smallest: -5
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.of elements of an array");
        int arraySize=sc.nextInt();
        int[] inputArr= new int[arraySize];
        for (int i=0; i<inputArr.length;i++){
            inputArr[i]=sc.nextInt();
        }
        Day1Programs que1=new Day1Programs();
//        System.out.println("smallest and Largest number from the array of elements is :"+ Arrays.toString(que1.largestAndSmallestNumber(inputArr)));
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        2. Find the Missing Number in an Array
//        You are given an array of n-1 integers in the range from 1 to n with no duplicates. One number is missing from the array. Find the missing number.
//
//        Example Input:
//        arr = [1, 2, 4, 6, 3, 7, 8]
//        n = 8
        Day1Programs que2=new Day1Programs();
        System.out.println("Array: "+Arrays.toString(inputArr));
        System.out.println("missing no from the array is :"+que2.missingNumber(inputArr));
    }
}
