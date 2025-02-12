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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements of an array");
        int arraySize = sc.nextInt();
        int[] inputArr = new int[arraySize];
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }
        Day1Programs que1 = new Day1Programs();
//        System.out.println("smallest and Largest number from the array of elements is :"+ Arrays.toString(que1.largestAndSmallestNumber(inputArr)));
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        2. Find the Missing Number in an Array
//        You are given an array of n-1 integers in the range from 1 to n with no duplicates. One number is missing from the array. Find the missing number.
//
//        Example Input:
//        arr = [1, 2, 4, 6, 3, 7, 8]
//        n = 8
        Day1Programs que2 = new Day1Programs();
//        System.out.println("Array: " + Arrays.toString(inputArr));
//        System.out.println("missing no from the array is :" + que2.missingNumber(inputArr));


//    3. Reverse an Array
//    Problem: Given an array, reverse it without using any extra array or data structure.
//    Input: [1, 2, 3, 4, 5]
//    Output: [5, 4, 3, 2, 1]
//    4. Find the Second Largest Element in an Array
//    Problem: Given an array of integers, find the second largest element.
//            Input: [12, 35, 1, 10, 34, 1]
//    Output: 34
//    5. Check if an Array is Sorted
//    Problem: Given an array of integers, check if the array is sorted in non-decreasing order.
//
//    Input: [1, 2, 3, 4, 5]
//
//    Output: True
//
//    Input: [5, 3, 4, 1, 2]
//
//    Output: False
//
//    6. Move Zeros to End of Array
//    Problem: Given an array, move all the zeros to the end of the array while maintaining the relative order of the non-zero elements.
//    Input: [0, 1, 9, 0, 3, 12]
//    Output: [1, 9, 3, 12, 0, 0]
//    7. Find the Majority Element
//    Problem: Given an array of size n, find the element that appears more than n/2 times. The majority element always exists.
//            Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
//    Output: 4
//    8. Union and Intersection of Two Arrays
//    Problem: Given two arrays, find the union and intersection of the two arrays.
//            Input: arr1 = [1, 2, 3, 4, 5], arr2 = [4, 5, 6, 7, 8]
//    Output:
//    Union: [1, 2, 3, 4, 5, 6, 7, 8]
//    Intersection: [4, 5]
//    9. Rotate an Array by K Positions
//    Problem: Given an array and a number k, rotate the array to the right by k steps.
//            Input: [1, 2, 3, 4, 5, 6], k = 2
//    Output: [5, 6, 1, 2, 3, 4]
//    10. Find the Duplicate in an Array
//    Problem: Given an array of n+1 integers, where each integer is between 1 and n, find the duplicate number.
//            Input: [1, 3, 4, 2, 2]
//    Output: 2
//    11. Check if Array Contains Duplicate
//    Problem: Given an array of integers, check if there are any duplicates in the array.
//            Input: [1, 2, 3, 1]
//    Output: True
//    12. Find the Pair with Given Sum
//    Problem: Given an array of integers and a sum, find two numbers in the array that add up to the sum.
//            Input: arr = [1, 2, 4, 3, 5], sum = 6
//    Output: Pair found: (1, 5) or (2, 4)
//    13. Largest Sum Contiguous Subarray (Kadane's Algorithm)
//            Problem: Given an array of integers, find the largest sum of a contiguous subarray.
//            Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//                                     Output: 6 (Subarray [4, -1, 2, 1])
//    14. Count Inversions in an Array
//    Problem: Given an array, count the number of inversions. An inversion is a pair of indices (i, j) such that arr[i] > arr[j] and i < j.
//    Input: [2, 4, 1, 3, 5]
//    Output: 3 (Inversions: (2, 1), (4, 1), (4, 3))
//    15. Find the Longest Consecutive Sequence
//    Problem: Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//    Input: [100, 4, 200, 1, 3, 2]
//    Output: 4 (The sequence is [1, 2, 3, 4])
//    16. find the third highest product of two elements from an array

        System.out.println("Enter no.of elements of an array");
        int arraySize1 = sc.nextInt();
        Integer[] inputArr1 = new Integer[arraySize1];
        for (int i = 0; i < inputArr1.length; i++) {
            inputArr1[i] = sc.nextInt();
        }
        Arrays.sort(inputArr1,Collections.reverseOrder());
        System.out.println(Arrays.toString(inputArr1));
        int curr, prev,ind1, ind2;
//        1,2,3,4,5,6,7
        int i=1;
            prev=inputArr1[i-1]*inputArr1[i+1];
            curr=inputArr1[i]*inputArr1[i+1];
            if(prev<curr){
                ind1=i-1;
                ind2=i+1;

            }
            else {
                ind1=i;
                ind2=i+1;

        }
        System.out.println("two elements which give third highest product of an array: " +inputArr1[ind1]+" | "+inputArr1[ind2]);

    }
}
