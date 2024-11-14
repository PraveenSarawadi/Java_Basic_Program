package com.practice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {
    int defaultArr[]=null;
//    Initializing Array
    public SingleDimensionalArray(int sizeOfArray){
        defaultArr=new int[sizeOfArray];
        for (int i=0;i<defaultArr.length;i++){
            defaultArr[i]=Integer.MIN_VALUE;
        }
    }
// Inserting element at the index
    public void insert(int index, int value){
        if(index>=defaultArr.length)
            throw new ArrayIndexOutOfBoundsException();
        defaultArr[index]=value;
    }
// Accessing array element
    public int getValue(int index){
        if(index>=defaultArr.length)
            throw new ArrayIndexOutOfBoundsException();
        return defaultArr[index];
    }
// Traversing Array
    public void traverseArray(){
        try{
            for(int i=0;i<defaultArr.length;i++){
                System.out.println(defaultArr[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
  }public static void main(String[] args) {
//        array declaration
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        SingleDimensionalArray obj1=new SingleDimensionalArray(size);
        obj1.insert(1,21);
        obj1.insert(0,20);
        obj1.insert(2,22);
        obj1.insert(3,23);

        System.out.println(Arrays.toString(obj1.defaultArr));
        System.out.println(obj1.getValue(3));
        obj1.traverseArray();
    }
}
