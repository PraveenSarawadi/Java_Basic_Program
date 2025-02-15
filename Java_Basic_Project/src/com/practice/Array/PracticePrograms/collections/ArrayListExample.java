package com.practice.Array.PracticePrograms.collections;

import java.io.*;
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>() ;
        arrayList.addAll(Arrays.asList(1,2,34,5,6,8,9));
        Iterator<Integer> itr=arrayList.iterator();
        while (itr.hasNext()){
            System.out.println("Elements: "+itr.next());
        }

//        Sort Array list
        Collections.sort(arrayList);
        arrayList.forEach(a1-> System.out.println("Stream: "+a1));

//        Serialization and deserialization - process used to convert java objects into byte stream and vice versa
        try{
            FileOutputStream fo= new FileOutputStream("arraySerialization");
            ObjectOutputStream objOut= new ObjectOutputStream(fo);
            objOut.writeObject(arrayList);
            fo.close();
            objOut.close();
            FileInputStream fi= new FileInputStream("arraySerialization");
            ObjectInputStream objIn= new ObjectInputStream(fi);
            ArrayList<Integer> array2= (ArrayList<Integer>) objIn.readObject();
            array2.forEach(a1-> System.out.println("File: "+a1));
            fi.close();
            objIn.close();
        } catch (IOException |ClassNotFoundException e) {
            throw new RuntimeException(e);

        }

//        retainAll - this method compares two collections and retains only the common elements of both collection

        List<String> names=List.of("ram","mar","arm","cat","tac","act");
        List<String> names2=new ArrayList<>(Arrays.asList("ra","mr","arm","cat","ac","act"));
        names2.retainAll(names);
        names2.forEach(name-> System.out.println("Names :"+name));

    }
}
