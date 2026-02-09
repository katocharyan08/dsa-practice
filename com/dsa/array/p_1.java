

public class p_1 {
    public static void main (String[] args){
      /*   int[] array = new int[5];
        array[1] =-5778;
        array[2] =5667;
        array[3] =-8765;
        array[4] =5852;
        array[5] =4568;
        array[6] =8545;*/
        int[] array = {-555,543,67,0,985,789};
        int max = Integer.MIN_VALUE;//in default the maximum value should be minimum at first..
        for(int element : array){
          if(element>max){
            max = element;
          }
        }
        System.out.println("the max element in array is :" + max );
    }
}