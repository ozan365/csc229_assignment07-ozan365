/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {63, 56, 73, 42, 1, 23, 6, 7, 523, 45};

        bubbleSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int a[], int size) {
        //allocating memory to only 3 variables
        int outer, inner, temp;

        //two loops which iterate about n ^ 2 times, (sum of numbers from 1 to length - 1)
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[outer]) {
                    temp = a[inner];
                    a[inner] = a[outer];
                    a[outer] = temp;
                }

            }
        }
    }
    //the time complexity of this code is O(n^2) since the 2 loops iterate about n^2 times
    //the space complexity of this code is O(1) since there are only 3 variables assigned
    
}
