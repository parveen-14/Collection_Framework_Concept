package collection;

import java.util.Arrays;

public class CustomArrayListExample {

     Object[] arrayObj={}; //empty array //actual memory allocated in constructor
     int size=0;
     public CustomArrayListExample(){
         arrayObj=new Object[10]; //initialize array with size

     }
     public void add(Object obj){
         if(size==arrayObj.length){
             IncreaseCapacity();
         }
       arrayObj[size++]=obj;
     }

    private void IncreaseCapacity() {
        int newCapacity= (arrayObj.length * 3) / 2;
        arrayObj= Arrays.copyOf(arrayObj,newCapacity);
    }
    public int size(){
         return size;
    }
    public void display(){
         for(int i=0;i<size;i++){
             System.out.println(arrayObj[i]);
         }
    }
    public Object get(int index){
         if(index<0|| index>=size) {
             throw new ArrayIndexOutOfBoundsException("invalid index" + index);
         }
        return arrayObj[index];
    }

    public static void main(String[] args) {
        CustomArrayListExample ls=new CustomArrayListExample();
        ls.add("Indian1");
        ls.add("Indian2");
        ls.add("Indian3");
        ls.add("Indian4");
        System.out.println(ls.size());
        ls.display();
        System.out.println(ls.get(1));

    }
}
