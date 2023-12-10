package com.leetcode.dec9;

import org.testng.annotations.Test;

public class ReverseLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        //constructor
        Node(int currentData) {
            this.data = currentData;
            next = null;
        }
        //add the node
    }

    public Node addNode(int data) {
        return new Node(data);
    }

    //reverse the node
    @Test
    public void reverseNode() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        printNodes(head);
        System.out.println("-----------------");
        reverseIt(head);
    }

    private void reverseIt(Node node) {
        Node head = node, prev = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        printNodes(head);
    }

    //print the node

    public void printNodes(Node node) {
        System.out.println(node);
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
