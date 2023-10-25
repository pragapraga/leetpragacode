package com.leetcode.oct22;
/*
Find the middle of the linkedlist in single iteration


Psuedo code
1. We need to have 2 pointers,fast and slow
2. Idea is fast pointer will move at 2x speed as compared to slow pointer
 */

import com.leetcode.listnode.ListNode;
import org.testng.annotations.Test;

public class LinkedListMiddleNodeTest {

    @Test
    public void testCase1() {

    }

    @Test
    public void testCase2() {

    }

    public ListNode findMiddleNodeInLinkedList(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode.next != null && fastNode.next.next != null) {
        slowNode = slowNode.next;
        fastNode = fastNode.next.next;
        }
        return slowNode;
    }
}
