
// find weather an array is sorted or not..
public class p_3{
    public static void main (String[] args){
     boolean isSorted  = true;//default true   
        int[] array = {23,74,58,23,45};
        for(int i=0;i<array.length-1;i++){
          if(array[i] > array[i+1]){//idx:2 > idx:3 then is sorted false 
            isSorted=false;
            break;
        }
        
    }
    if(isSorted){//true by default
        System.out.println("the array is sorted");
    }
    else{//false after traverse on for loop
        System.out.println("the array is not sorted");
    }

    }
}