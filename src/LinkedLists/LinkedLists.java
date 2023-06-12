package LinkedLists;

public class LinkedLists {
    public static void main(String[] args) {
    //LinkedLists are similar to arrayLists but dont have
    //indexes to search for
    //LinkedLists data are spread out/scattered, also has a 'head' and 'tail'

//     'head'           'tail'    head and tails are variables and pointers
    //  (11)=>(3)=>(23)=>(7)=>null
//      nodes =^

//Adding something to end of linkedlist is O(1)
//Removing something from end of list is O(n)
//Cant move backwards in list, need to restart from beginning and reset pointer pointing to last node to tail

//Adding item to front of LinkedList O(1)
//set new node to head (front of list) and then move head to new front node
//Removing 1st node :
//move head to next node, then get rid of old first node

//Insert node in middle of LinkedList : O(n) due to having to iterate
//iterate through beginning of list to the point you want to insert, set new node to point to next node after the insertion point, then, set the passsed up node to point to newly inserted node

// 1 => 2 => 3 => 4   to  1=> 2=> 3\\  4   becomes 1 => 2 => 3 =>5 => 4
//                                   5//

//To remove from middle of list, iterate from beginning to reach node to be deleted, set node prior to point to node after node to be deleted, set node to be deleted to null. due to iteration O(n)

//Searching for values: O(n)
// Must start at head and iterate till value found,
//  Looking for index must still start at beginning and iterate

// A node is both a value and a pointer, similar to a HashMap
//    11 => 3 => 23 => 7 => 4 =>null

//      head = {"value"=11,
//         "next"={
//          "value"=3,
//           "next"={
//              "value"=23,
//      tail =   "next"=...{}
//              }
//        }

    }
}
