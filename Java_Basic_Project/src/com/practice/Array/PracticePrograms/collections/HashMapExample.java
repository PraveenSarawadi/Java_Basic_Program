package com.practice.Array.PracticePrograms.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap= new HashMap<>();
        hashMap.put(1,"Rame");
        hashMap.put(5,"marak");
        hashMap.put(8,"Ramesh");
        hashMap.put(2,"marakdg");
        hashMap.put(3,"iame");
        hashMap.put(4,"mskarak");
        for(Map.Entry map:hashMap.entrySet()){
            System.out.println( map.getKey()+" : "+map.getValue());
        }
        System.out.println("get value: "+hashMap.get(5));

        Set set=hashMap.entrySet();
        Iterator itr= set.iterator();
        while(itr.hasNext()){
            Map.Entry map=(Map.Entry) itr.next();
           String variable=" key "+ map.getKey()+" value: "+map.getValue();
            System.out.println(variable);
        }
    }
}
