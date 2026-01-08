package com.dsa.string;
// use to resolve modify the string without creating new object bcoz string builder is mutable
public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i < 26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());//O(N) good
        //methods
        System.out.println(builder.delete(0,3));
        System.out.println(builder.charAt(6));
        System.out.println(builder.isEmpty());
        System.out.println(builder.capacity());
        System.out.println(builder.hashCode());
        System.out.println(builder.length());
        System.out.println(builder.reverse());
        System.out.println(builder.codePointAt(5));
        System.out.println(builder.offsetByCodePoints(5,117));
        System.out.println(builder.insert(3,"an"));

    }
}
