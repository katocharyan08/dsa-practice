package com.oops.generics;

import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//its also working as inddex value

    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];  
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        for(int i = 0;i < data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove(){
       int removed = data[--size];
       return removed;
    } 

    public int get(int index){
        return data[index];
    }

    public void set(int index,int value){
         data[index] = value;
    }

    public int size(){
        return size;
    }
     @Override
     public String toString(){
        return "CustomArraylist {" +
        "data = " + Arrays.toString(data) +
        ", size = "+ size +
        "}";
     }

    public static void main(String[] args) {
        CustomArraylist data = new CustomArraylist();
        // data.add(4);
        // data.add(6);
        // data.add(7);
        // data.add(3);
        
        // System.out.println(data.get(3));
        // data.remove();
        // System.out.println(data.size());
        // data.set(2,43);
        // System.out.println(data.get(2));
        // System.out.println(data);

        for(int i = 0; i < 14; i++){
            data.add(3*i);
        }
        System.out.println(data);
    }
}
