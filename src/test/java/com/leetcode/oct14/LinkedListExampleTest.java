package com.leetcode.oct14;

import javax.sound.sampled.Line;

public class LinkedListExampleTest {

    int a;
    static int b;
    //[DataValue, pointer]<=Node

    Node headNode, tailNode;

    class Node { //inner class
        int value;
        Node nextNode;

        Node(int val) {
            this.value = val;
        }

//        @Override
//        public String toString() {
//            return String.valueOf(this.value+" - >");
//        }
    }

//CRUD ->  create , read, update, delete

    //add , remove, delete


    public void add() {
        System.out.println(headNode);
    }

    public void addToTail(int val) {
        System.out.println(headNode);
        if (headNode == null) {
            headNode = tailNode = new Node(val);
            System.out.println(headNode);
        }
        else{
            System.out.println("HeadNode Value"+headNode.value);
            System.out.println("Before Obj creation "+tailNode.value);
            tailNode = new Node(val);
            System.out.println("HeadNode Value"+headNode.value);
            System.out.println("After Obj creation "+tailNode.value);
            System.out.println(tailNode);
            tailNode = tailNode.nextNode;
            System.out.println("HeadNode Value"+headNode.value);
            System.out.println("After new Tail  "+tailNode.value);
            System.out.println(tailNode.value);
        }
    }

    public static void main(String[] args) {
        LinkedListExampleTest list = new LinkedListExampleTest();
        list.add();
        list.addToTail( 5);
        list.addToTail( 6 );
    }


}
