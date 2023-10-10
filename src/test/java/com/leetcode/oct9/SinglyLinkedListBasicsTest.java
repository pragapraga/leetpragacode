package com.leetcode.oct9;

import org.junit.Test;

public class SinglyLinkedListBasicsTest {
    Node head, tail;
    private int size = 0;
    boolean isHeadPrinted = true;

    class Node {
        int value;
        Node next;


        Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public void addMultipleNode(int n) {
        if (head == null) { //this is the 1st node that needs to be created
            head = tail = new Node(n); //creating and assigning to head/tail
            //System.out.println(tail.value + "->null");
            size++;
        } else {
//            if (isHeadPrinted) {
//                isHeadPrinted = false;
//                System.out.print(tail.value + "->");
//            }

            tail.next = new Node(n);
            tail = tail.next;
           // System.out.print(tail.value + "->");
            size++;
        }
    }

    public Node addNode(int n) {
        return new Node(n);
    }

    public void removeHead() {
        System.out.println("Removing "+head.value);
        head = head.next;
    }

//    public void displayCurrentLinkedList(Node head){
//        while(head.next!=null){
//            System.out.println(head.value);
//            head = head.next;
//        }
//    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("null");
    }


    @Test
    public void testcase1() {
        SinglyLinkedListBasicsTest linkedListBasicsTest = new SinglyLinkedListBasicsTest();
        int[] listOfIntegers = new int[]{11, 43, 27, 11, 90};
        for (int currentNumber : listOfIntegers) {
            linkedListBasicsTest.addMultipleNode(currentNumber);
        }
        System.out.println("null");
        System.out.println("Overall size is " + linkedListBasicsTest.size);


        linkedListBasicsTest.display();
        linkedListBasicsTest.removeHead();

    }
}
