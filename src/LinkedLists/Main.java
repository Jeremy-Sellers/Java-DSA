package LinkedLists;

public class Main {
    public static void main(String[] args) {
        LinkedList firstLinkedList = new LinkedList(1);

//        firstLinkedList.getHead(); // Head: 4
//        firstLinkedList.getTail(); // Tail: 4
//        firstLinkedList.getLength(); // Length: 4
//
//        firstLinkedList.printList(); // 4

        // head => Node(4)
        // tail ==//^
        //

        firstLinkedList.append(2);

        System.out.println("New List: ");
        firstLinkedList.printList();
//        REMOVE LAST NODE
//        2 items in list
//        System.out.println(firstLinkedList.removeLastNode().value);
////        1 item in list
//        System.out.println(firstLinkedList.removeLastNode());
////        0 items in list
//        System.out.println(firstLinkedList.removeLastNode());

//        System.out.println("New List: ");
//        firstLinkedList.append(3);
//        firstLinkedList.printList();

//        System.out.println(firstLinkedList.removeLastNode().value);
//        System.out.println(firstLinkedList.removeLastNode());
//        System.out.println("After remove last node: ");
//        firstLinkedList.printList();

//        firstLinkedList.prepend(5);
//        System.out.println("New List: ");
//        firstLinkedList.printList();

//        System.out.println(firstLinkedList.removeFirstNode());
//        System.out.println(firstLinkedList.removeFirstNode());
//        System.out.println(firstLinkedList.removeFirstNode());

        firstLinkedList.append(3);
        firstLinkedList.append(4);
        System.out.println("New List: ");
        firstLinkedList.printList();

        System.out.println(firstLinkedList.getFromIndex(2));
    }
}
