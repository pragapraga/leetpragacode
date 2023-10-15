package com.leetcode.oct14;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
@input -
@output -



 */
public class CyclicNodeTest {
    ListNode headNode,tailNode;
    public void addNodes(int data){
        if(headNode==null){
            headNode=tailNode= new ListNode(data);
        }
        tailNode= new ListNode(data);
        tailNode=tailNode.next;
    }

    public void display(){
        ListNode currentNode = headNode;
        while(currentNode!=null){
            System.out.println(currentNode.val + " => ");
            currentNode = currentNode.next;
        }
        System.out.println(" null ");
    }
        public static void main(String[] args) {
        int rand = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println(rand);
        CyclicNodeTest cycle = new CyclicNodeTest();
        int[] input = new int[]{1,2,3,4,5};
            for (int n: input) {
                cycle.addNodes(n);
            }
        cycle.display();
    }

}
