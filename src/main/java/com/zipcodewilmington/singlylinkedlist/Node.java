package com.zipcodewilmington.singlylinkedlist;

public class Node <elementType extends Object>{
    int next;
    int last;
    elementType value;

    public Node(elementType e){
           this.value =e;
    }
}
