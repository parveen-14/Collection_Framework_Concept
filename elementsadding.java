package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class elementsadding {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();

        System.out.println("Enter elements 1 to 50");

        while(true) {
            num = sc.nextInt();

            if (num == -1)
                break;
//System.out.println("It is invalid");
            if (num >= 1 && num <= 50) {
                list.add(num);
            }
            else{
                System.out.println("Please enter no between 1 to 50");
            }
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()) {
            if (it.next() > 25) {
                it.remove();
            }
        }
        System.out.println("Updated List:" +list);
    }
}
