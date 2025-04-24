package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("abd");
        list.add("aaa");
        list.add("aac");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
       Iterator<String> it=list.iterator();
       while(it.hasNext()){  //return true if more element is present.
           System.out.println(it.next()); //getting next element for printing.
//        for (String s : list) {
//            System.out.println(s);
        }
    }
}
