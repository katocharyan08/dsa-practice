package com.oops.project;

public class Teacher extends User {
    int maxBook = 5;

    void issueBook(){
        System.out.println("Number of maxx book teacher can issue is "+ maxBook);
    }
}
