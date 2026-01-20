package com.oops.project;

public class Student extends User {
    int maxBook = 2;

    void issueBook(){
        System.out.println("Student can issue max book is " + maxBook);
    }
}
