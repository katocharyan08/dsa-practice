package com.oops.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student aryan = new Student(88,01);
        Student kunal = new Student(90, 3);

        if(aryan.compareTo(kunal) < 0){
            System.out.println("kunal has more marks");
            System.out.println(aryan.compareTo(kunal));
        }
    }
}
