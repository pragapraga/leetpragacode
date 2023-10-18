package com.leetcode.oct9;

import org.testng.annotations.Test;
public class RemoveLinkedListTest {

    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){
            head = head.next;
        }
        ListNode current = head;
        while(current!=null && current.next!=null){
            if(current.next.val == val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }

    @Test
    public void testcase1(){
        int[] input = new int[]{1,2,6,3,4,5,6};
        ListNodeImpl tc1 = new ListNodeImpl();
        tc1.addAllUsingIntArray(input);
        tc1.display();
        ListNode currentHead = removeElements(tc1.head,6);
        tc1.display();
        System.out.println("\n"+currentHead.val);
    }

    @Test
    public void testcase2(){

    }

    @Test
    public void testcase3(){

    }
}
