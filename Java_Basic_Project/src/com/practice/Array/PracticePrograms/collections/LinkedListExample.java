package com.practice.Array.PracticePrograms.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.addFirst(12);
        linkedList.add(13);
        linkedList.addAll(List.of(14,15,16,17,18));
        linkedList.addLast(19);
        linkedList.add(20);
        linkedList.forEach(a-> System.out.println(a));
        linkedList.add(4,155);
        System.out.println(linkedList.stream().toList());
        System.out.println(Arrays.stream(linkedList.toArray()).toList());
//        using iterator
        Iterator<Integer> itr= linkedList.descendingIterator();
        while (itr.hasNext()){
            System.out.println("Iterator: "+itr.next());
        }
//        sort elements
        System.out.println((linkedList.stream().sorted().toList()));
        System.out.println(linkedList.stream().sorted((a1,a2)->a2.compareTo(a1)).toList());
//        remove elements
        linkedList.pop();
        System.out.println(linkedList.stream().toList());
    }
}
