package com.practice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {
    int defaultArr[]=null;
//    Initializing Array
    public SingleDimensionalArray(int sizeOfArray){
        defaultArr=new int[sizeOfArray];
        for (int i=0;i<defaultArr.length;i++){
            defaultArr[i]=0;
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
  }
//  check whether the element present in the array
  public boolean containsElement(int searchElement) {
/* time complexity - O(n)
      try {
          for (int element : defaultArr) {
              if (element == searchElement)
                  return true;
          }
          return false;
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
 */
      try {
          for (int i=0;i<= defaultArr.length/2;i++) {
              if (defaultArr[i] == searchElement||defaultArr[defaultArr.length-(i+1)] == searchElement)
                  return true;
          }
          return false;
      } catch (Exception e) {
          throw new RuntimeException(e);
      }

  }
// delete element from te input index of an array
  public String deleteElement(int index){
        try{
            defaultArr[index]=0;
            return "element deleted";
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
  }
  public static void main(String[] args) {
//        array declaration
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        SingleDimensionalArray obj1=new SingleDimensionalArray(size);
        obj1.insert(1,21);
        obj1.insert(0,20);
        obj1.insert(2,22);
        obj1.insert(3,23);

        System.out.println(Arrays.toString(obj1.defaultArr));
//        System.out.println(obj1.getValue(3));
//        obj1.traverseArray();
      System.out.println("enter search element in the array");
      int searchElement=sc.nextInt();
        if(obj1.containsElement(searchElement))
            System.out.println("Array contains element");
        else
            System.out.println("Array does not contain element");
      System.out.println("enter index at which element needs to be deleted");
      int deleteIndex=sc.nextInt();
      System.out.println("status of deletion: "+ obj1.deleteElement(deleteIndex));
    }
}
