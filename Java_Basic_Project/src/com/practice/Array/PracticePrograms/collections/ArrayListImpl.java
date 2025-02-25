package com.practice.Array.PracticePrograms.collections;

import java.util.*;

public class ArrayListImpl implements List {

//   Arraylist is a dynamic array collection which is implementation of list interface
    public Object[] elements;  // elements of an array
    private static final int DEFAULT_CAPACITY=4;
    public int size; // no of elements in the array

    public ArrayListImpl(){
        elements=new Object[DEFAULT_CAPACITY];
        size=0;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(size+1);
        elements[size++]=o;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if(minCapacity>elements.length){
            int newCapacity=elements.length*2;
            elements=Arrays.copyOf(elements,newCapacity);
        }
    }

    @Override
    public Object get(int index) {
        if(index>=size|| index<0){
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        return (Object) elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        if(index>=size||index<0){
            throw new IndexOutOfBoundsException("Index passed is out of bound");
        }
        Object oldElement=elements[index];
        elements[index]=element;
        return oldElement;
    }

    @Override
    public void add(int index, Object element) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("Index out of bound");
        ensureCapacity(size+1);

        for(int i=size;i>index;i--){
            elements[i]=elements[i-1];
        }
        elements[index]=element;
        size++;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    public String containsCustom(Object o) {
        for(int i=0;i<size;i++){
            if(elements[i]==o)
                return true+ " at position: "+i;

        }
        return false+" value not present";
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> listImp= new ArrayListImpl();
        System.out.println(listImp.size());
        listImp.add(1);
        listImp.add(3);
        listImp.add(1,6);
        listImp.add(6);
        listImp.add(9);
        for (int i=0;i<listImp.size();i++){
            System.out.println("element: "+listImp.get(i));
        }
        System.out.println(((ArrayListImpl) listImp).containsCustom(6));
    }







    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }




    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
