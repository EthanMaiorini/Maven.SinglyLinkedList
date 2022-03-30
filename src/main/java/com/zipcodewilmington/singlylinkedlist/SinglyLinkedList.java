package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<elementType extends Object> {
    private Integer size = 0;
    Node head;
    void SinglyLinkedList(){
        Node head = new Node();
        size++;
    }

    void SinglyLinkedList(elementType e){
        Node head = new Node(e);
    }

    public void add(elementType e){
        Node node;
        if(head.next == null)
            head.next = new Node(e);
        else{node = head.next;
            while(node.next != null)
                node = node.next;
            node.next = new Node(e);
        }
        size++;
    }

    public void remove(elementType e){
        Node node;
        if(head.value.equals(e))
            head = null;
        else if(head.next != null) {
            if ((head.next.value.equals(e))&&(head.next.next == null))
                head.next = null;
            else if (head.next.value.equals(e))
                head.next =head.next.next;
            else {
                node = head.next;
                while ((!node.next.value.equals(e))&&(node.next !=null)) {
                    node = node.next;
                }
                if((node.next.value.equals(e))&&(node.next.next == null))
                    node.next =null;
                else node.next = node.next.next;
            }
        }
        size--;
    }

    public Integer size(){
        return size;
    }

    Boolean contains(elementType e){
        return false;
    }

    Integer find(elementType e){
        return -1;
    }

    elementType get(Integer index){
        return elementType e;
    }

    SinglyLinkedList copy(){

    }

    SinglyLinkedList sort(){

    }

}
