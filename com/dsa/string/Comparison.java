package com.dsa.string;

public class Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";
        String c = a;
        String d = new String("aryan");
        String e = "aryan";
        System.out.println(d==e);
        System.out.println(d.equals(e));   
        System.out.println(e.charAt(1));
       // System.err.println(a == c);
       // System.out.println(a == b); true
     
       String n1 = new String("kunal");
       String n2 = new String("kunal");

       //System.out.println(n1 == n2);
       System.out.println(n1.equals(n2));//.equals is the method its only cares about value
       System.out.println(n1.charAt(3));
    }
}
