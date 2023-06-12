package pointers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        int num1 = 11;
//        int num2 = num1; // no pointer used so if num1 changes after this, num2 remains equal to original num1 value
//
//        num1 = 22;
//
//        System.out.println("num1 : " + num1);
//        System.out.println("num1 : " + num2);
//---------------------Pointers-----------------------------------V
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value",11);
        map2 = map1;

        System.out.println(map1);//11
        System.out.println(map2);//11

        map1.put("value",22);
        System.out.println(map1);//22
        System.out.println(map2);// also changes to 22 as map2 references map1 in memory not a literal value

        HashMap<String,Integer> map3 = new HashMap<>();
        map3.put("value",33);

        System.out.println(map3);//33
        map2 = map3;
        System.out.println(map2);//33

//        if all maps get pointed away from original key:value , that value cannot be accessed and will be deleted by Java using "Garbage Collection"
    }
}
