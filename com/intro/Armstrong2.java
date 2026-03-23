package com.intro;

public class Armstrong2 {
    public static void main(String[] args) {
        int num = 159;

//count digits
int temp = num;
int count = 0 ;
while(temp>0){
 count++;
temp/=10;
}
//sum
int sum = 0;
temp = num;
while(temp>0){
 int digit = temp%10;
sum = sum + (int)Math.pow(digit,count);
temp/=10;
}
//check
if(num == sum){
 System.out.println("Armstrong");
}
else{
 System.out.println("no");
}
    }
}
