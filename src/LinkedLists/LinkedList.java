package LinkedLists;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node { //inner class
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

//    Creates new Node
 public void append(int value){}
//    Creates new Node, adds Node to end
 public void prepend(int value){}
//    Creates new Node, adds Node to beginning
 public boolean insert(int index, int value){}
//    Create new Node, insert Node at index

}
