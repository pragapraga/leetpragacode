package com.leetcode.oct10;
import org.testng.annotations.Test;

public class SinglyLinkedList {
    public class Node{
        Node nextNode;
        int value;//

        public  Node(){};
        public Node(int value){
            this.value = value;
            //this.nextNode=null;//1->null
            System.out.println("nextNode Value :: "+this.nextNode);
        }
    }
    Node headNode,tailNode;
    int size;
    public Node addNode(int newValue){
        return new Node(newValue);
    }
    public void addNodes(int currentValue){
        if(headNode==null){ //only 1 time
            headNode = tailNode =new Node(currentValue); //1
           // size++;
        }
        else{
            tailNode.nextNode = new Node(currentValue);//1.next= 2
            //size++;
            tailNode=tailNode.nextNode; //<=====
        }
        size++;
    }
    private int size(){
        return size;
    }
    public void display(){
        Node currentNode=headNode;
        while(currentNode!=null){
            System.out.print(currentNode.value+" -> ");
            currentNode=currentNode.nextNode; //a++
        }
        System.out.println(" null ");
    }
    public void removeHead(){
        System.out.println("Value that is removed :: "+headNode.value);
        if(headNode.nextNode==null){
            headNode = new Node(); //only one element
        }
        else{
            headNode = headNode.nextNode; //multiple elements
        }
        System.out.println("New Head will be  :: "+headNode.value);
        size--;
    }
    public void removeByIndex(int index){
        int counter=0;
        if(index>=size || index<0){
            return ;
        }
        else if(index==0){
            headNode = headNode.nextNode;
            size--;
        }
        else{
            Node previousNode=headNode,currentNode=headNode;
            while(currentNode!=null){
                if(counter++==index){
                    previousNode.nextNode = currentNode.nextNode;
                    size--;
                    break;
                }
                currentNode = previousNode;
                currentNode = currentNode.nextNode;
            }
        }
    }

//    public void removeByValue(int valueToRemove){
//        Node previousNode=null;
//        Node currentNode=headNode;
//
//     while (currentNode != null){
//         if(currentNode.value==valueToRemove){
//             headNode = headNode.nextNode; //headNode value
//         else if (currentNode.nextNode == null) {
//                 tailNode = previousNode;
//                 previousNode.nextNode = null;
//             }
//         }
//         else{
//             currentNode = previousNode;
//             currentNode = currentNode.nextNode;
//         }
//     }
//    }

    @Test
    public void testLinkedList(){
        SinglyLinkedList test = new SinglyLinkedList();
        int[] listInteger = new int[]{1,2,3};

//        test.addNode(100);
//        test.addNode(200);

        for (int n :listInteger) {
            //System.out.println(test.size());
            test.addNodes(n);//(2)
        }
        test.display();
        System.out.println(test.size());
        test.removeHead();
        test.display();
        System.out.println(test.size());
        test.removeByIndex(1);
        test.display();
        System.out.println(test.size());
    }
}

