package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedListPrograms {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(20);
        list.add(50);
        list.add(40);
        System.out.println("Print the list element:"+list);

        list.removeFirst();
        //Iterating elements
        System.out.println("Removing first element");
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //2nd using for each
//        for(Integer i:list){
//            System.out.println(i);
//        }
        System.out.println("Removing last elements:");
      list.removeLast();
        Iterator<Integer> it1=list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        list.addFirst(500);
        list.addLast(40);
        System.out.println("Added other elements");
        Iterator<Integer> it2=list.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
