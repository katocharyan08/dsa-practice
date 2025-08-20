package com.intro;
import java.util.Arrays;

public class VariableArgs {
    public static void main (String [] args){
              inputs(6,67,46,765);
              multiple(23,'a',"arayn","sgsfd","rsgg");
    }

     static void inputs(int ...v){
           System.out.println(Arrays.toString(v));
           
     }  

     static void multiple(int a,char c,String ...x){
        System.out.println(a+c+Arrays.toString(x));//error
     }



}
