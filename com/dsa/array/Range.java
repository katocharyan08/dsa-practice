
public class Range {
    public static void main(String[] args) {
        int[] arr = {434,64545,554563,763487,973474,6567,43663,73476};
        System.out.println(rangeMax(arr,2,6));
        

    }
    static int rangeMax(int[] arr, int start,int end){
           int maxval = Integer.MIN_VALUE;    
        for(int i = start;i<end;i++){
                 if (maxval<arr[i]){
                      maxval = arr[i];
                 }
            }
            return maxval;
    }
}
