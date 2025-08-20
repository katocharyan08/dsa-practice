package com.intro;

public class greeting {

    public static void main(String[] args) {
       String inbox = mygreet("Aryan katoch");//this mygreet function has return value of message
       System.out.println(inbox); 
    }
    
    static String mygreet( String name){
        String message= "my name is "+name;
        return message;
    }    
    
}
