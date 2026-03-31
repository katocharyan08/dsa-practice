package com.oops.enumexamples;

public class Example {
    enum Week implements A {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        Week(){
        System.out.println("constructor called for " + this);
    }
    @Override
    public void hello(){
        System.out.println("hello");
    }
    }
    
    //internally : public static final Week Monday = new Week();
    public static void main(String[] args) {
        Week week;
        week = Week.MONDAY;
       System.out.println(Week.valueOf("MOnday"));

        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
