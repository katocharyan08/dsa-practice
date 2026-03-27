package test;
import java.util.Arrays;

import com.oops.generics.CustomGenArraylist;

public class Factor {
    public static void main(String[] args) {
        int num = 36;
        int[] arr = factors1(num);
        System.out.println(Arrays.toString(arr));
    }
    static int[] factors1(int n){
    CustomGenArraylist<Integer> list = new CustomGenArraylist<>();
//ArrayList<Integer> list = new ArrayList<>();
   for(int i = 1; i * i <= n; i++){
       if(n % i == 0){
         if(n / i == i){
           list.add(i);
} 
        else{
           list.add(i); 
           list.add(n/i);
}
}
}
    //store in array
    int[] divisor = new int[list.size()];
     for(int k = 0;k < list.size();k++){
        divisor[k] = list.get(k);
     }

return divisor;
}
}