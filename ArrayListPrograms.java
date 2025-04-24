package collection;

import java.util.ArrayList;

public class ArrayListPrograms {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.ensureCapacity(20);
        list.add("Java1");
        list.add("Java2");
        list.add("100");
        list.add("200");
        list.add("Java1");
        list.add("300");
        System.out.println(list.size()); //5 elements
        list.trimToSize();
        System.out.println(list.isEmpty()); //false
        //boolean obj=list.contains("100");
        //System.out.println(obj);
        System.out.println(list.contains("200"));
        System.out.println(list.indexOf("Java1")); //first index occurrence
        System.out.println(list.lastIndexOf("Java1"));  //last index occurrence
      //converting an arraylist to array  //first getting element
        Object[] array=list.toArray();
        //print array
        for(Object obj1:array){
            System.out.println(obj1);

            //--> getting specified position array
        }
        System.out.println("Index no 3 element is: " +list.get(3));
        //--> replace the element in arraylist with particular element
        list.set(2 , "500");
        System.out.println(list);
    }
}
