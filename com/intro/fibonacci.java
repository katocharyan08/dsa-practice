package com.intro;

 public class fibonacci{
     public static void main(String[] args){
         System.out.println("printin fibonacci sequence");
         int num=10,a=0,b=1; 
         for(int i=1;i<num;i++){
            if(i<=8){
             System.out.print(a +" ");//0,1,1,2,3,5
             int c=a+b;//1,2,3,5,8,
             a = b;//1,1,2,3,5,
             b = c;//1,2,3,5,8,
            }
          }
}
}/* 
//question-> do sum of fibonacci sequence 
public class fibonacci{
  public static void main(String[] args){
    int a=0;
    int b=1;
    for (int i = 0;i<=8;i++){
      System.out.println(a);
      int c = a+b;
      a=b;
      b=c;

    }

  }*/
