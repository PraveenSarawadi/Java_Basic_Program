package com.practice.Array.PracticePrograms.collections;


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
class SinglyLinkedListTest{
    Node head;
    public SinglyLinkedListTest(){
        this.head=null;
    }
    public void insert(int data){
        Node node=new Node(data);

        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void display(){
        Node node=head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

    }

    public boolean search(int key){
        Node node=head;
        while(node!=null){
            if (node.data==key) {
                return true;
            }
            node=node.next;
        }
        return false;
    }

    public void remove(int value) {
        Node current = head;
        if (current != null && current.data == value) {
            head = current.next;
            return;
        } else {
            Node prev = null;
            while (current != null && current.data != value) {
                prev = current;
                current = current.next;
            }
            if (current != null && current.data == value)
                prev.next=current.next;
        }
    }
//    remove from index
    public void removeAt(int index){
        Node current=head;
        if(index==0)
            head=head.next;

        else{
            Node prev=null;
            for(int i=0;i<index;i++){
                prev=current;
                current=current.next;
            }
            prev.next=current.next;
        }
    }
//    replace value
    public void replace(int oldValue,int newValue){
        Node current = head;
        if (current != null && current.data == oldValue) {
            head.data = newValue;
            return;
        } else {
            Node prev = null;
            while (current != null ) {
                if(current.data==oldValue) {
                    current.data = newValue;
                    return;
                }
                current=current.next;

            }
            System.out.println("Oldvalue entered does not exist in collection");
        }
    }

}
public class SinglyLinkedListImpl {
    public static void main(String[] args) {


        SinglyLinkedListTest lidt = new SinglyLinkedListTest();
            lidt.insert(10);
            lidt.insert(12);
            lidt.insert(18);
            lidt.insert(32);
            lidt.insert(89);
            System.out.println("search result: "+lidt.search(12));
            lidt.insert(15);
            lidt.remove(12);
            lidt.insert(34);
            lidt.replace(34,67);
            lidt.display();
    }

}
