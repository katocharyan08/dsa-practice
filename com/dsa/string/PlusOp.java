package com.dsa.string;
import java.util.*;

public class  PlusOp{
    public static void main(String[] args) {
        System.out.println('a'+'a');
        System.out.println('a'+ 1);
        System.out.println('u'+0);
        System.out.println((char)('a'+1));//typecasting
        System.out.println("a"+'a');
        System.out.println("a"+1);
        System.out.println("a"+ new Integer(56));
        System.out.println(new ArrayList<>()+ "aryan");
        System.out.println(new ArrayList<>()+ ""+new Integer(56));//atleast one type object 
       //error -> System.out.println(new ArrayList<>()+new Integer(56));
    }
    }

