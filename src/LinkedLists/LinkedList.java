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

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    //    Creates new Node
 public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){ // if LinkedList is empty
            head = newNode;
            tail = newNode;
        } else { //if list is not empty
            tail.next = newNode; // moves new node to end of list
            tail = newNode; // moves tail to new last node
        }
 }

 public Node removeLastNode(){
     if (length == 0) return null;// if length starts at 0 ;
        Node pre = head;
        Node temp = head;
     while (temp.next != null){
                pre = temp;
                temp = temp.next;
            }
    tail = pre;
    tail.next = null;
    length--;
    if (length == 0){ // for when a node is removed and length becomes 0
        head = null;
        tail = null;
    }
            return temp;
        }
//    Creates new Node, adds Node to end

 public void prepend(int value){
        Node newNode = new Node(value); //create new node
        if (length == 0){ //if list empty, add new node
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head; //(node)=>  set value to previous first node
            head = newNode; //then set head variable to new first node
        }
        length++;
 }
//    Creates new Node, adds Node to beginning

    public Node removeFirstNode(){
        if (length == 0) {return null;} // if list empty
        Node temp = head;
        head = head.next; //block of code used to remove node from beginning
        temp.next = null;
        length--;
        if (length == 0){ // if removing only Node
            tail = null;
        }
        return temp;
    }

    public Node getFromIndex(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
// public boolean insert(int index, int value){}
//    Create new Node, insert Node at index

}
