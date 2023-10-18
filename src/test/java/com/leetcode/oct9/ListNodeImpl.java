package com.leetcode.oct9;
public class ListNodeImpl {

    ListNode head;

    public void add(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode current =head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addAllUsingIntArray(int[] intArray){
        for (int n: intArray) {
            add(n);
        }
    }

    public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.val+"->");
            current = current.next;
        }
        System.out.print("null\n");
    }
}
