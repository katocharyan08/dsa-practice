
package com.intro;
import java.util.*;

public class Fi {


    public static void main(String[] args) {
       
        int pv,n;
        double r ;
        try(Scanner in = new Scanner(System.in)){
            pv = in.nextInt();
            r = in.nextDouble();
            n = in.nextInt();
           
           
       double fv = pv * Math.pow (1+r/100,n);


       System.out.println("fv : "+fv);
        }
    }
}

