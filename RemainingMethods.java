package collection;

import java.util.HashSet;
import java.util.Set;

public class RemainingMethods {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.add(200);
        s.add(100);

        String a1="Parveen";
        String b1="Parveen";

       int value=a1.hashCode();
       int value2=b1.hashCode();

        System.out.println(value);
        System.out.println(value2);

        boolean val=a1.equals(b1);
        System.out.println(val);
        boolean val2=a1.hashCode()==b1.hashCode();
        System.out.println(val2);


    }
}
