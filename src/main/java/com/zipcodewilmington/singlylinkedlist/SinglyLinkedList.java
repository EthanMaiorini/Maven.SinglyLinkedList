package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<elementType extends Object> {
    private Integer size = 0;
    Node head;
    void SinglyLinkedList(){
        Node head = new Node();
        head.index = 0;
        size++;
    }

    void SinglyLinkedList(elementType e){
        Node head = new Node(e);
        head.index =0;
    }

    public void add(elementType e){
        Node node;
        if(head.next == null) {
            node = new Node(e);
            head.next = node;
            node.index = head.index+1;
            node.next = null;
        }
        else{node = head.next;
            while(node.next != null)
                node = node.next;
            node.next = new Node(e);
            node.next.index = node.index+1;
            node.next.next = null;
        }
        size++;
    }

    public boolean remove(int index){
        Node node;
        Node lastNode = null;
        if (index >= size)
            return false;
        if(index == 0){
            head = head.next;
            resetIndex(head,index);
        }
        node = head.next;
        while(node.index != index){
            lastNode = node;
            node = node.next;
        }
        lastNode.next = node.next;
        resetIndex(lastNode,index);
        size--;
        return true;
    }

    public void resetIndex(Node node,int index){
        while(index < size){
            node.index = index;
            node = node.next;
            index++;
        }
    }

    public Integer size(){
        return size;
    }

    Boolean contains(elementType e){
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

    Integer find(elementType e){
        Node node;
        if(head.value.equals(e))
            return head.index;
        node = head.next;
        while(node != null) {
            if (node.value.equals(e))
                return node.index;
            node = node.next;
        }
        return -1;
    }

    elementType get(Integer index){
        if(index >= size)
            return null;
        if(index == 0)
            return (elementType)head.value;
        Node node = head.next;
        while(node.index != index)
            node = node.next;

        return (elementType)node.value;
    }

    SinglyLinkedList copy(){
        Node node,newNode = null;
        SinglyLinkedList newLinked = new SinglyLinkedList();
         newLinked.head.value = head.value;
         newLinked.head.index = 0;
         node = head.next;
         newLinked.head.next = newNode;
         while(node.next != null){
             newNode.value = node.value;
             newNode.index = node.index;
             newNode.next = node.next;
             newNode = newNode.next;
             node = node.next;
         }
        newNode.value = node.value;
         return newLinked;
    }

    SinglyLinkedList sort(){
        int length = size-1;
        Node lastNode,thisNode,nextNode;
        for(int i =0;i<length;i++) {
            for (int y = 0; y < length- i; y++) {
                if (( != null)&&(this.students[y+1] != null)) {
                    if ((this.students[y].getAverageExamScore()) < (this.students[y + 1].getAverageExamScore())) {
                        this.students = switchArr(this.students, y);
                    } else if (this.students[y].getAverageExamScore() == this.students[y + 1].getAverageExamScore()) {
                        if ((lexographicalIsEqual(this.students[y].getLastName(), this.students[y + 1].getLastName())) == 1) {
                            this.students = switchArr(this.students, y);
                        } else if ((lexographicalIsEqual(this.students[y].getLastName(), this.students[y + 1].getLastName())) == -1) {
                            if ((lexographicalIsEqual(this.students[y].getFirstName(), this.students[y + 1].getFirstName())) == 1) {
                                this.students = switchArr(this.students, y);
                            }
                        }
                    }
                }else if (students[y] == null) removeStudent(students[y].getFirstName(),students[y].getLastName());
                else if(students[y+1] == null) removeStudent(students[y+1].getFirstName(),students[y+1].getLastName());
            }
        }
        return this.students;
    }

    public Node switchArr(Student[]students,int value){

        Student temp = students[value];
        students[value] = students[value + 1];
        students[value + 1] = temp;
        return  students;
    }

}
