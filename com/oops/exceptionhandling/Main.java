package com.oops.exceptionhandling;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        
        try{
           //divide(a, b);
           //throw new Exception("just for learning");
           String name = "Aryan";
           if(name.equals("Aryan")){
            throw new MyException("Creating my own exception");
           }
        }catch(MyException e){
            System.out.println(e.getMessage());
            System.out.println("hello my exception");
        }catch(ArithmeticException e){
           //throw new ArithmeticException("hehe Arithmetic exception");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
          //  System.out.println("normal exception");
        }finally{
            System.out.println("this will execute always");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            //throw exception
            throw new ArithmeticException("Please enter something reasonable");
        }
            return a/b;
        }
}
