package com.oops.generics.comparing;

public class Student implements Comparable<Student>{
    float marks;
    int roll_no ;

    public Student(float marks,int roll_no){
        this.marks = marks;
        this.roll_no = roll_no;
    }
    @Override
    public int compareTo(Student other){
        int diff = (int)(this.marks - other.marks);
        //diff == 0,then both are equal
        //diff < 0, then o is big else o is small
      return diff; 
    }
}
