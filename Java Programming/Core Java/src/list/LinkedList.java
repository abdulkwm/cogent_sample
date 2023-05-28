package list;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> list = new java.util.LinkedList<>();
        list.add("Abdu");
        list.add("Mohammed");
        list.add("play");
        list.add("10");
        list.add("20");
        System.out.println(list);
//        System.out.println(list.get(3));
//        add at specific index
//        list.add(1,"sekina");
//        System.out.println(list);
////        contains() method
//        if (list.contains("Abd")){
//            System.out.println("I got it");
//        }else {
//            System.out.println("Not found");
//        }
//        set() method to update data
//        list.set(1,"summeya");
//        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
