package com.oops.generics;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            arr.add(i*2);
        }
    /*lambda function for iteration 
        arr.forEach((item) -> System.out.println(item));
        */
    //to use as many time with different list,we create it using  variable of type Consumer<Integer> 
        Consumer<Integer> var  = (item) -> System.out.println(item);
        arr.forEach(var);
    
    //pass behaviour like variables    
      Operation sum = (a,b) -> (a+b);
      Operation prod = (a,b) -> (a*b);
      Operation sub = (a,b) -> (a-b);
      Operation div = (a,b) -> (a/b);
      
      //calling it
      LambdaFunctions var1 = new LambdaFunctions();
      System.out.println(var1.operate(40, 54, sum));
      System.out.println(var1.operate(47, 51, prod));
      System.out.println(var1.operate(44, 57, sub));
      System.out.println(var1.operate(42, 35, div));
    
    }
    //How to call these
    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}
 //for multiple parameters you can create interface like consumer
    interface Operation{
        int operation(int a ,int b);
    }
