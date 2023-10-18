package com.leetcode.listnode;

import java.util.List;

public class ListNodeImpl {
    ListNode head;
    int size;
    public void add(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.println(current.val+" -> ");
            current= current.next;
        }
        System.out.println("null");
    }

    public ListNode addAll(int[] intArr){
        for (int n: intArr) {
            add(n);
        }
        return head;
    }
}
