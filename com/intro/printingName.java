package com.intro;
import java.util.*;
public class printingName {
    static void printMyName(String name){
        System.out.println(name);
    }

    public static void mian(String[] args){
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       printMyName(name);
       sc.close();
    }
}
