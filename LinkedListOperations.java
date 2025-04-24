package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        list.add("Java4");
        list.add("Java5");
        System.out.println(list);
        list.add(0,"Java");
        System.out.println(list);
        System.out.println("Iterating elements:");
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //using for each loop
//        for (String s : list) {
//            System.out.println(s);
//        }


            }


    }

