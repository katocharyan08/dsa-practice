package com.oops.collection;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
          List<Integer> list1 = new ArrayList<>();
          list1.add(23);
          list1.add(233);
          list1.add(25);
          System.out.println(list1);
          List<Integer> list2 = new LinkedList<>();
          list2.add(23);
          list2.add(233);
          list2.add(25);
          System.out.println(list2);

          //Vector
          List<Integer> vector = new Vector<>();
          vector.add(23);
          vector.add(233);
          vector.add(25);
          System.out.println(vector);
    
    }
}
