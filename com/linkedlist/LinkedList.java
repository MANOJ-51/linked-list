package com.linkedlist;

public class LinkedList {
    Node head = null;     //inititally we are taking head null

    public static void main(String[] args) {
        //displaying welcome message
        System.out.println("Welcome to linked list ");

        //creating object of linked list class
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(56);
        linkedList.append(70);
        linkedList.insertBetween(56, 30);
        linkedList.search(30);
        linkedList.searchInseret(30,40);


        linkedList.print();  //printing linked list elements keys and data
    }

    //uc-2 insert 70,30,56 output-56,30,70
    public <M> void addFirst(M key) {
        Node node = new Node(key);    //first adds 70 next overides 70 with 30 and then 56

        node.setNext(head);
        head = node;
    }

    //uc-3 first we add 56 then we append 30 and 70 to 56 output 56->30->70
    public <M> void append(M key) {
        Node currentNode = head;     //temply taken as head
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        Node node = new Node(key);
        currentNode.next = node;
    }

    //uc-4 insert 30 in between 56 and 70
    public <M> void insertBetween(M previousKey, M key) {
        Node currentNode = head;
        while (currentNode.key != previousKey) {
            currentNode = currentNode.next;
        }
        Node node = new Node(key);
        node.next = currentNode.next;
        currentNode.next = node;
    }

    //uc5 delete first element 56  out put 30->70
    public <M> Node popFirst() {
        Node currentNode = head;
        head = head.next;
        return currentNode;
    }

    //uc6 delete last element in the list
    public <M> void popLast() {
        Node currentNode = head;
        Node previousToLast = null;
        while (currentNode.next != null) {
            previousToLast = currentNode;
            currentNode = currentNode.next;
        }
        previousToLast.next = null;
    }

    //uc7 search element
    public <M> boolean search(M key) {
        Node currentNode = head;
        while (currentNode.key != null) {
            if (currentNode.key == key) {
                System.out.println("NODE:-" + currentNode.key);
                return true;
            }
            currentNode = currentNode.next;
        }
        System.out.println("NODE not found");
        return false;
    }

    //uc8 insert 40 after 30  output56,30,40,70
    public <M> boolean searchInseret(M previousKey, M insertKey) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.key.equals(previousKey)) {
                insertBetween(previousKey, insertKey);
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
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
