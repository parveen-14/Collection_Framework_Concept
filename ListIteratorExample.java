package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        //list.add(100);
       // list.add(80);
        System.out.println(list);

        ListIterator<Integer> list1= list.listIterator();
            System.out.println("list iterator in forward direction");//|10204010080

           boolean element =list1.hasNext();
        System.out.println("Value Present " + element);//it will print true..

        int index1=list1.nextIndex();
        Integer value1=list1.next();//10 |20.....
        System.out.println("Index " +index1 +" value is "+value1);

//        boolean valuee=list1.hasNext();

        int index2=list1.nextIndex();
        Integer value2=list1.next();
        System.out.println("Index "+index2+ " value is " +value2);



        int index3=list1.nextIndex();
        Integer value3=list1.next();
        System.out.println("Index "+index3 + " Value is " +value3);

        boolean element2=list1.hasNext();
        System.out.println(element2);

        Integer value4=list1.next();//it will throw an exception which is NoSuchElementException


        }
    }


