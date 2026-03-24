package  com.intro;

public class p2 {
    public static void main(String[] args) {
        int num = 1233456;
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int digit = temp%10;
            if(digit%2 == 0){
              sum = sum + digit;  
            }
            temp/=10;
        }
        System.out.println(sum);
    }
}
