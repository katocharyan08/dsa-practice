package com.dsa.mathsfordsa;
/*problem : check for prime number in a range of n.
  approach : -> Assume all numbers from 2 to n are prime.
             -> start from first prime number 2.
             -> mark all multiples of its as not prime.
             -> check for next unmarked num and repeat.
             -> continue this process till root n.
time complexity : O(n * log(log(n))) and space complexity : O(n) {for extra space}           
*/
public class Seive {
    public static void main(String[] args) {
        int n = 30;
        boolean[] primes = new boolean[n+1];
        seive(primes,n);
    }
    static void seive(boolean[] primes,int n){
        for(int i = 2;i*i <= n; i++){
            if(!primes[i]){//for false
                for(int j = i*2;j <= n; j+=i){
                    primes[j] = true;//mark
                }
            }
        }
        for(int i = 2; i <= n;i++){
            if(!primes[i]){
                System.out.println(i + " ");
            }
        }
    }
}
