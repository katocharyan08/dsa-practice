package com.dsa.recursion;

public class BasicStringProblem {
    public static void main(String[] args) {
        removeChar("baccad", "");
    }
    // 1st way
    static void removeChar(String str, String ans){
        if ( str.isEmpty()){
           System.out.println(ans);
           return;
        }
        char ch = str.charAt(0);
        if (ch == 'a'){
            removeChar(str.substring(1), ans);
        }
        else{
            ans = ans + ch;
            removeChar(str.substring(1), ans);
        }
    }
}
