package com.leetcode.oct10;

import com.leetcode.listnode.ListNode;
import com.leetcode.listnode.ListNodeImpl;
import org.testng.annotations.Test;

/*
https://leetcode.com/problems/middle-of-the-linked-list/

@input - ListNode
@output - ListNode

Testdata 2 - head = [1,2,3,4,5] => [3,4,5]
Testdata 2 - [1,2,3,4,5,6] => [4,5,6]

Psuedo code
1. Declare slowNode and fastNode and assign it to head
2. while fastNode and fastNode.next is not null, increment slowNode by 1 and fastNode by 2times, by this way, while fastNode reaches end of the list,
slowNode would be in middle since it is travelling half the speed of fastNode
 */
public class MiddleOfTheLinkedListTest {
    @Test
    public void testcase1 (){
    int[] input = new int[]{1,2,3,4,5};
        ListNodeImpl ll = new ListNodeImpl();
        ListNode head = ll.addAll(input);
        searchMiddleOfTheLinkedList(head);
    }
    @Test
    public void testcase2 (){
    int[] input = new int[]{1,2,3,4,5,6};
        ListNodeImpl ll = new ListNodeImpl();
        ListNode head = ll.addAll(input);
        searchMiddleOfTheLinkedList(head);
    }

    private ListNode searchMiddleOfTheLinkedList(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while(fastNode!=null&&fastNode.next!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }
}
