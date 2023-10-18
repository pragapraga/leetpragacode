package com.leetcode.oct15;

public class LinkedListImplementation {

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            this.next =null;
        }
    }

    Node head,tail;
    public void addAll(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next=newNode;
        }
    }

    public void addToTail(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public Node add(int[] value){
        for(int each : value) addAll(each);
        return head;
    }


    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.value+" -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
        LinkedListImplementation listImpl = new LinkedListImplementation();
        for (int n : input) {
            listImpl.addToTail(n);
            listImpl.display();
        }
    }
}
