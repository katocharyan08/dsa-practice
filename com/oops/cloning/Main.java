package com.oops.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(32,"Aryan");
        //Human h2 = new Human(h1);

        Human h3 = (Human)h1.clone();
        System.out.println(h3.age +" , "+ h3.name);
        System.out.println(Arrays.toString(h3.arr));
        h3.arr[0] = 11;
        System.out.println(Arrays.toString(h1.arr));

    }
}
