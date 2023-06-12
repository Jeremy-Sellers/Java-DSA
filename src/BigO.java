import java.util.ArrayList;

public class BigO {
//    BigOcheatsheet.com
    //A way of comparing 2 sets of code mathematically regarding efficiency

    //Time Complexity : measuring how long it takes sets of code to complete running
    //Measured by num of operations taken to complete something, not literal time
    //Space Complexity : memory used to complete task

    //3 symbols omega , theta, and omicron (or O)

//    Omega -  best case time complexity
//    Theta - average case time complexity
//    Big 0 - Worst case time complexity
//--------------------------------------------------------------------------
//    O(n) - proportional - 1 print for 1 loop
//    public static void printItems(int n){
//        for (int i = 0; i < n; i++){
//            System.out.println(i);
//        }
//    }
//--------------------------------------------------------------------------
//    O(2n) => O(n) constant dropped - 1 print per loop, twice
//    public static void printItemsTwice(int n){
//        for (int i = 0; i < n; i++){
//            System.out.println(i);
//        }
//        for (int j = 0; j < n; j++){
//            System.out.println(j);
//        }
//    }
//--------------------------------------------------------------------------
//    O(n^2) - n^2 ran printed 10 times, 10 times, thus O(n^2)
//    public static void printItemsDoubleLoop(int n){
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++) {
//                System.out.println(i + " " + j);
//            }
//        }
//    }
//    Graphed, O(n^2) grows much faster (than O(n)) thus is less efficient
//    Loop within a Loop
//--------------------------------------------------------------------------
//    Drop Non-Dominates
//public static void dropNonDominates(int n){
//    for (int i = 0; i < n; i++){ // runs O(n^2)
//        for (int j = 0; j < n; j++) {
//            System.out.println(i + " " + j);
//        }
//    }
//    for (int k = 0; k < n; k++){ //runs O(n)
//        System.out.println(k);
//    }
    // whole function runs O(n^2 + n)
//       As n grows, 1st for loop set outgrows k loop and makes it irrelevant so k is dropped
//}
//--------------------------------------------------------------------------
//  O(1) - Only one operation, most efficient big O operation
//    public static int addItems(int n){
//        return n + n;
//    }
//  Constant
//--------------------------------------------------------------------------
//  O(log n)
//    only slightly less efficient as O(1) better than O(n) and O(n^2)

//    Different Terms For inputs :
//    if you get a loop that takes in different params for their loop, cannot be O(n) since params arent guaranteed to be the same. if loops are one after the other, it would be O(param1 + param2). if loops inside of eachother it would be O(firstLoopParam * secondLoopParam)
//  Divide and Conquer "Is num in first or second half, get rid of whichever it isnt, recheck for next set, get rid of half number is not in, check next set, etc.
//--------------------------------------------------------------------------
//Big O of arrayLists
//    O(1) = to add something to end of arraylist as all thats happening it a new item being added. Finding by index is O(1) as its immedieatly known location
//    O(n) to work with beginning of array because not only is something being added/removed, indexes are also being changed. O(n) as iteration is constant until searched value is found
//--------------------------------------------------------------------------

//    When n = 100 :
//        O(1) = 1;
//        O(logn) = ~7
//        O(n) = 100
//        O(n^2) = 10,000 most inefficient
//    Drop Constants - first rule of simplification
    public static void main(String[] args) {
//        printItems(10); //O(n)
//        printItemsTwice(10); // O(2n) => O(n) constant is dropped
//        printItemsDoubleLoop(10); //O(n^2) loops through 10, 10 times
//        dropNonDominates(10);
//        ArrayList myArray = new ArrayList<>();
//        myArray.add(1); // O(1)
//        myArray.add(3);
//        myArray.add(17);
//        myArray.add(13);
//        myArray.add(0,15); // O(n)
//        System.out.println(myArray);
    }
}
