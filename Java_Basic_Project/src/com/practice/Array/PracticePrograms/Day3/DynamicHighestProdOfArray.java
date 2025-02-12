package com.practice.Array.PracticePrograms.Day3;
// find the two elements which give highest or lowest product of an array

import java.util.*;

public class DynamicHighestProdOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        System.out.println("Enter Elements of an array");
        Integer[] arr=new Integer[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position of product");
        int position=sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        Integer[] newArr=Arrays.copyOfRange(arr,0,position);
        Integer[] prodArr = new Integer[position];
        int prodArrIndex=0;
        System.out.println("Product of array elements till the position:"+Arrays.toString(newArr));
        for(Integer element:newArr){
            int elePos=0;
            for(int j=0;j<newArr.length;j++){
                if(newArr[j]==element) {
                    elePos = j;
                    break;
                }
            }
            while (element!=newArr[newArr.length-1]){
                if(elePos==newArr.length-1)
                    break;
                prodArr[prodArrIndex]=element*newArr[elePos+1];
                elePos++;
                prodArrIndex++;

            }
        }
        System.out.println("Product of array elements till the position:"+Arrays.toString(prodArr));

//        factors of element
        List<Integer> elements=new ArrayList<>();
        int prodElement=prodArr[position-1];
        for(int i=prodElement;i>=1;i--){
            int j=i;
            if(prodElement%i==0&& Arrays.stream(newArr).anyMatch(e->e==j)){
                elements.add(i);
            }
        }
        System.out.println("Product of array elements till the position:"+(elements.toString()));
    }
}
