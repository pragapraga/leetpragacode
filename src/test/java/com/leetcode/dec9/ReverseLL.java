package com.leetcode.dec9;
import org.testng.annotations.Test;

public class ReverseLL {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }

    public Node addNode(int data) {
        Node node = new Node(data);
        return node;
    }

    public void printAllNodes(Node node) {

        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }

    // 8 --> 12 ---> 4 ---> 7
    @Test
    public void testReverseNodes() {
        Node head = addNode(8);

        Node second = addNode(12);
        head.next = second;

        Node third = addNode(4);
        second.next = third;

        Node last = addNode(7);
        third.next = last;

        printAllNodes(head);
        printAllNodes(reverseNodes(head));

    }

    @Test
    public void testfindDups() {
        Node head = addNode(8);

        Node second = addNode(12);
        head.next = second;

        Node third = addNode(12);
        second.next = third;

        Node last = addNode(14);
        third.next = last;

        printAllNodes(head);
        System.out.println("The first duplicate is - " + findDuplicate(head));

    }

    // 8 --> 12 ---> 4 ---> 7

    /* Reverse the nodes (Singly Linked List)
     *
     * Node -> node head, next = null, prev = null
     *
     *
     *
     * 8 (prev)
     * 12 --> 4 --> 7
     *
     * 8 <-- 12
     *
     * 4 --> 7
     *
     * 8 <-- 12 <-- 4
     *
     * 7
     *
     * 8 <-- 12 <-- 4 <-- 7
     *
     */

    public Node reverseNodes(Node node) {

        Node head = node, prev = null, next = null;

        while (head != null) {
            // next
            next = head.next;
            // prev
            head.next = prev;

            // swap
            prev = head;
            head = next;
        }
        return prev;
    }

    public Node reverseNodes2(Node node) {

        Node head = node, prev = null, next = null;


        while (head != null) {

        }

        return prev;

    }

    public int findDuplicate(Node node) {

        Node head = node;

        while (head.next != null) {
            if (head.data == head.next.data) {
                return head.data;
            }
            head = head.next;
        }

        return -1;

    }


}