package test.recursion;

public class printNnum {
    public static void main(String[] args) {
      //  print(5);
        System.out.println();
        print1(6);
    }
    //ascending
    static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.print(n+" ");

    } 
    //descending
    static void print1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        print1(n-1);
    }
}
