/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(0));
        System.out.println(getSumOfPrimes(1));
        System.out.println(getSumOfPrimes(2));
        System.out.println(getSumOfPrimes(3));
        System.out.println(getSumOfPrimes(100));
        System.out.println(getSumOfPrimes(1000));
    }

    public static long getSumOfPrimes(int n){
        //2 variables and 2 steps
        long sum = 0;
        boolean isPrime = false;

        //the inner loop of this program executes about N^2 times
        for(int i = 2; i <= n; i++) {
            isPrime = true;

            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if(isPrime)
                sum+= i;
            isPrime = false;
        }
        return sum;
    }

    //this program has 2 nested loops that in total, execute in about N^2 steps, therefore the time complexity is O(n^2)
    //this program has 2 variables, which uses a constant amount of memory, therefore the space complexity is O(1)
    
}
