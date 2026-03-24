package  com.intro;

import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i = 0;i <= arr.length-2;i++){
            for(int j = 1;j<arr.length - i;j++){
                //swap
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
