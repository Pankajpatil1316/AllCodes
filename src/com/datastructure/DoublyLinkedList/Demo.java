package com.datastructure.DoublyLinkedList;

import java.security.PublicKey;

public class Demo {

    DoubleyN head;

    public void insertAtBegining(String data){

        DoubleyN newNode = new DoubleyN(data);
        if(head==null)
            head=newNode;
                //11<->
        else {        //12<->13<->null
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void insertAtLast(String data){
        DoubleyN newNode = new DoubleyN(data);
        if(head==null)
            head=newNode;
                           //<->14
        else{       //12<->13<->null
            DoubleyN currentNode = head;
            while (currentNode.next!=null)
            {
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
            newNode.prev=currentNode;
        }
    }

    //11<->12<->13<->14<->NULL
    public void deleteFirst(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        head=head.next;
        head.prev=null;
    }

    public void deleteLast(){
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        DoubleyN currentNode = head;
        while (currentNode.next.next!=null) {
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }
    public void display(){

        if(head==null)
            System.out.println("List is empty");
        else {
            DoubleyN currentNode = head;
            while (currentNode!=null) {
                System.out.print(currentNode.data + "<->");
                currentNode=currentNode.next;
            }
            System.out.println("NULL");
        }
    }

    public void deleteByData(String data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==data){
            head=null;
        }
        else {
            DoubleyN currentNode = head;        //          15
            while (currentNode.next.data!=data){//12<->13<->15<->16<->17<->NULL
                currentNode = currentNode.next;
            }
            currentNode.next=currentNode.next.next;
            currentNode.next.prev=currentNode;
        }
    }

    public static void main(String[] args) {

        Demo doublyLinkedList = new Demo();


        doublyLinkedList.insertAtBegining("13");
        doublyLinkedList.insertAtBegining("12");
        doublyLinkedList.insertAtBegining("11");
        doublyLinkedList.insertAtLast("14");
        doublyLinkedList.display();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.display();
        doublyLinkedList.deleteLast();
        doublyLinkedList.insertAtLast("15");
        doublyLinkedList.insertAtLast("16");
        doublyLinkedList.insertAtLast("17");
        doublyLinkedList.display();
        doublyLinkedList.deleteByData("15");
        doublyLinkedList.display();
    }
}
