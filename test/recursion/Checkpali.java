package test.recursion;

public class Checkpali {
    public static void main(String[] args) {
        String str = "kamak";
        System.out.println(check(str,0,str.length()));
    }
    static boolean check(String str,int i,int n){
        if(i>=n/2){
            return true;
        }
           if(str.charAt(i) != str.charAt(n-i-1)){
              return false;
           }
           return check(str, i+1, n);
    }
}
