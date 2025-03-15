package org.dsaProblems.numbers;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FactorsOfNum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        Set<Integer> ls= new TreeSet<>();
        ls=factorsOfNumber(num);
        ls.forEach(System.out::println);
    }

    private static Set<Integer> factorsOfNumber(int num) {
        Set<Integer> ls= new TreeSet<>();
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                ls.add(i);
                if(num/i!=i){
                    ls.add(num/i);
                }
            }
        }
        return ls;
    }
}
