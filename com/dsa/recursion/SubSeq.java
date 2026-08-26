package com.dsa.recursion;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {  
        System.out.println(subSeq2("","abc"));
    }
    static void subSeq(String processed, String un_processed){
        //basecase 
        if(un_processed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = un_processed.charAt(0);

        subSeq(processed + ch, un_processed.substring(1));
        subSeq(processed, un_processed.substring(1));
    }
    //pass in argument
    static ArrayList<String> subSeq(String p ,String up ,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        subSeq(p + ch, up.substring(1), list);
        subSeq(p, up.substring(1), list);

        return list;
    }
    //pass inside function
    static ArrayList<String> subSeq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subSeq2(p + ch, up.substring(1));
        ArrayList<String> right = subSeq2(p, up.substring(1));

        left.addAll(right);
        return left; 
    }
}
