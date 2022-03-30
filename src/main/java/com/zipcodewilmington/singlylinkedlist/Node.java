package com.zipcodewilmington.singlylinkedlist;

public class Node <elementType extends Object>{
    Node next = null;
    elementType value = null;
    int index;

    public Node(elementType e){
           this.value =e;
           this.next = null;

    }

    public Node(){
    }

}
