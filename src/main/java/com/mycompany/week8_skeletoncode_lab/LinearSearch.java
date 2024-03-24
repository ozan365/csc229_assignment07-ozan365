/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 1; i <= 7; i++)
            System.out.println(search(arr, i));
    }

    public static int search(int arr[], int x)
    {
        //1 step and 1 variable
        int n = arr.length;

        //traverses the array using a for loop until object is found: n steps
        for(int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;

        //this algorithm's time complexity is O(n) since the time required to traverse the array depends on its length
        //this algorithm's space complexity is O(1) since only one variable is created every time
    }
    
}
