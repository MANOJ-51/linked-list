package com.linkedlist;

public class LinkedList {
    Node head = null;     //inititally we are taking head null

    public static void main(String[] args) {
        //displaying welcome message
        System.out.println("Welcome to linked list ");

        //creating object of linked list class
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node<>(56);
        Node node2 = new Node<>(30);
        Node node3 = new Node<>(70);

        linkedList.head.next = node2;
        node2.next = node3;


        linkedList.print();  //printing linked list elements keys and data
    }

    //PRINTING METHOD FOR LINKED LIST
    public <M> void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.key + "-->");    //56-->30-->70-->null
            currentNode = currentNode.next;    //i++ increament method to move to next node2,node3
        }
        System.out.println("null");    //after third node no value will assign and will be equals to null
    }
}
