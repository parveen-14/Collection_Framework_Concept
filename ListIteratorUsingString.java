package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorUsingString {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Present Elements Are " +list);

        ListIterator<String> iterator=list.listIterator(list.size());
        System.out.println("List Iterator in backward direction");

        while(iterator.hasPrevious()){
            String s= iterator.previous();
            System.out.println(s);
        }
        System.out.println("After backward Iterating");
        ListIterator<String> iterator1=list.listIterator(list.size()); // i am taking second iterator to traverse this
                                                               // again for printing the element with index.
        while(iterator1.hasPrevious()){
            int index1= iterator1.previousIndex();
            String value1= iterator1.previous();
            System.out.println("index " +index1 + " value of "+value1);
        }

        System.out.println("After forward Iterating");
        ListIterator<String> iterator2=list.listIterator();
        while(iterator2.hasNext()){
            int index2=iterator2.nextIndex();
            String value2=iterator2.next();
            System.out.println("Index "+index2 + " value is "+value2);
        }

//        boolean element=iterator.hasPrevious();//return true because elements are present
//        System.out.println(element);

//        int index1=iterator.previousIndex();//instead of using this for forward
                                              //iterating we can use loop as simple as that.
//        String value1= iterator.previous();
//        System.out.println("Index "+index1 + "Value of "+ value1);
    }
}
