package com.oops.generics;

import java.util.Arrays;

public class CustomGenArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;//its also working as inddex value

    public CustomGenArraylist(){
        this.data = new Object[DEFAULT_SIZE];  
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for(int i = 0;i < data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
       T removed = (T)(data[--size]);
       return removed;
    } 

    public T get(int index){
        return (T)(data[index]);
    }

    public void set(int index,T value){
         data[index] = value;
    }

    public int size(){
        return size;
    }
     @Override
     public String toString(){
        return "CustomGenArraylist {" +
        "data = " + Arrays.toString(data) +
        ", size = "+ size +
        "}";
     }

    public static void main(String[] args) {
       CustomGenArraylist<Integer> list = new CustomGenArraylist<>();
        for(int i = 0; i < 14; i++){
            list.add(3*i);
        }
        System.out.println(list);
    }
}
