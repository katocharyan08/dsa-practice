
package com.intro;
import java.util.*;

public class Distance {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in) ){
                System.out.println("enter point x1 & x2 respectively :");
                int x1 , x2 ;
                x1 = in.nextInt();
                x2 = in.nextInt();
                
                System.out.println("enter point y1 & y2 respectively :");
                int y1,y2;
                y1 = in.nextInt();
                y2 = in.nextInt();
              
                double dist = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2-y1,2));
                System.out.println("Distance between two points : "+dist);


        }
    }    
}
