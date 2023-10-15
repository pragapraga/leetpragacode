package com.leetcode.oct14;
/*

https://leetcode.com/problems/intersection-of-two-linked-lists/


 */

public class LinkedListCommonTest {

    ListNode headNode;
    ListNode tailNode;
    int size;

    public ListNode addNode(int value) {
        return new ListNode(value);
    }

    public void addAll(int value) {
        System.out.println("headNode value :: " + headNode);
        if (headNode == null) {
            headNode = tailNode = new ListNode(value);
        } else {
            tailNode = new ListNode(value);
            tailNode = tailNode.next;
        }
        size++;
    }

    public void display(){
        ListNode currentNode = headNode;
        while(currentNode!=null){
            System.out.println(currentNode.val+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListCommonTest list = new LinkedListCommonTest();
        int[] nums = new int[]{1,2,3,4,5};
        for (int n:nums) {
        list.addAll(n);
        }
        list.display();
    }
}
