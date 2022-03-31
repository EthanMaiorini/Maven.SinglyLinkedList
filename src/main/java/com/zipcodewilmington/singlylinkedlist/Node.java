package com.zipcodewilmington.singlylinkedlist;

public class Node {
    Node next = null;
    Integer value = null;

    public Node(Integer e){
           this.value = e;
           this.next = null;

    }

    public Node(){
        this.next = null;
    }

}
