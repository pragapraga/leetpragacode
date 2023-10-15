package com.leetcode.oct15;

/*
Implement the Doubly Linked List - Add First, Add Last, Remove First, Remove Last methods.

null<--1-->null - initial Node
null<--1-->2<-->3<-->4<-->5-->null - after inserting Nodes

1. head's previous will be null
2. tail's next will be null
3. Other nodes will have values for next and previous

------------------------------------------------------------------------------------------------------------------------

AddFirst
1. If the head's previous is null - Multiple nodes is available
2. If the head's previous is null and head's next is also null, insert as head - fresh node

correction - If the head's previous is null, add the node as head

Add Last
2. If the tail's next is null , insert as tail and also refer tail.previous

------------------------------------------------------------------------------------------------------------------------
RemoveFirst
1. If the head's previous is null and head's next is not null, make head.next as head and make head.previous as null

RemoveLast
1. If the tail's next is null, make tail.previous as tail


1. buy sell stock
2. anagram
3. group anagram - https://leetcode.com/problems/group-anagrams/
4. two sum
5. sliding window
6. String
7. Array
8. shortest string with unique characters
9.
------------------------------------------------------------------------------------------------------------------------



 */
public class DoublyLinkedListImpl {

    Node head, tail;

    public class Node {
        Node next;
        Node previous;
        int value;

        Node(int value) {
            this.value = value;
            this.next=null;
            this.previous=null;
        }
        Node(int value, Node node, Node previous, Node next) {
            this.value = value;
            this.next=next;
            this.previous=previous;
        }
    }


    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            head.next= newNode;
            //newNode.next = head;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println(" null ");
    }

    public static void main(String[] args) {
        DoublyLinkedListImpl dList = new DoublyLinkedListImpl();
        dList.addFirst(4);
        dList.addFirst(5);
        dList.display();
    }
}
