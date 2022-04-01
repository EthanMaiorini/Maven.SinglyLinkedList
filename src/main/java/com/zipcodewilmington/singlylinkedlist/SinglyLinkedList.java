package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList{
    private Integer size = 0;
    Node head;

    public SinglyLinkedList(){
        head = new Node();
        size++;
    }

    public SinglyLinkedList(Integer e){
        head = new Node(e);
        size++;
    }

    public Integer add(Integer e){
        Node node;
        if(head.next == null) {
            node = new Node(e);
            head.next = node;
            node.next = null;
        }
        else{node = head.next;
            while(node.next != null)
                node = node.next;
            node.next = new Node(e);
            node.next.next = null;
        }
        size++;
        return size;
    }

    public boolean remove(int index){
        Node node;
        int iterate =0;
        Node lastNode = null;
        if (index >= size)
            return false;
        if(index == 0){
            head = head.next;
        }
        node = head.next;
        lastNode = head;
        iterate++;
        while(iterate != index){
            lastNode = node;
            node = node.next;
            iterate++;
        }
        lastNode.next = node.next;
//        resetIndex(lastNode,index);
        size--;
        return true;
    }

    public Integer size(){
        return size;
    }

    public Boolean contains(Integer e){
        Node node;
        if(head.value.equals(e))
            return true;
        node = head.next;
        while(node != null) {
            if (node.value.equals(e))
                return true;
            node = node.next;
        }
        return false;
    }

    public Integer find(Integer e){
        Node node;
        int index =0;
        if(head.value.equals(e))
            return index;
        node = head.next;
        index++;
        while(node != null) {
            if (node.value.equals(e))
                return index;
            node = node.next;
            index++;
        }
        return -1;
    }

    public Integer get(Integer index){
        int iterate = 0;
        if(index >= size)
            return null;
        if(index == 0)
            return head.value;
        Node node = head.next;
        iterate++;
        while(iterate != index) {
            node = node.next;
            iterate++;
        }
        return node.value;
    }

    public SinglyLinkedList copy(){
        Node node;
        SinglyLinkedList newLinked = new SinglyLinkedList(head.value);
         node = head.next;
         while(node.next != null){
            newLinked.add(node.value);
            node = node.next;
         }
        newLinked.add(node.value);
         return newLinked;
    }

    public SinglyLinkedList sort(){
        SinglyLinkedList s = new SinglyLinkedList();
        Node thisNode = null,nextNode = null;
        Node tempNode = head;
        thisNode = head;
        nextNode = head.next;
        for(int i =0;i<size-1;i++) {
            for (int y = 0; y < size - i; y++) {
                if(nextNode == null)
                    break;
                if (thisNode.value > nextNode.value) {
                    tempNode.value = thisNode.value;
                    thisNode.value = nextNode.value;
                    nextNode.value = tempNode.value;
                }
                thisNode = nextNode;
                nextNode = thisNode.next;
            }
            thisNode = head;
            nextNode = thisNode.next;
        }
           s.head = head;
        return s;
        }

}
