package com.dsa.recursion;

public class SubSeq {
    public static void main(String[] args) {
        subSeq("","abc");
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
}
