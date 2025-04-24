package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();//using generics for knowing the type of the object.
        int a = 100;
        list.add(a);
        list.add(200);
        list.add(400);
        list.add(300);
        list.add(500);
        System.out.println(list);//printing list of the element.
        list.remove(4);
        System.out.println(list);//removing last element.
//        int remo=list.remove(1);
        int size = list.size();
        System.out.println(size);//size of the element.
        boolean isEmpty = list.isEmpty();// checking elements are not present.
        System.out.println(isEmpty);
        boolean contains = list.contains(100);//element availability.
        System.out.println(contains);


        Object[] b = list.toArray();//for getting elements or objects.
        System.out.println("List of elements");

        for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
    }
    }
}