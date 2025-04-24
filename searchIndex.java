package linkedlist;

import java.util.LinkedList;

public class searchIndex {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);

        int index=list.indexOf(7);

        if(index != -1){
            System.out.println("index found of 7 number is "+index);
        }else {
            System.out.println("index not found  of 7 no in the list");
        }

    }
}