/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = -1; i <= 11; i++)
            System.out.println("i = " + i + ", index = " + runBinarySearchIteratively(arr, i, 0, arr.length-1));
    }

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {

        //assign one variable
        int index = Integer.MAX_VALUE;

        //while loop continues while the low is less than high
        //the difference between low and high is halved each time the loop iterates until they are the same or the key is found
        //therefore, this halving nature causes the loop to iterate for about logbase2(n) steps
        while (low <= high) {
            //assigns one variable
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //this program has a loop that iterates for about logbase2(n) steps, therefore the time complexity of the code is O(log(n))
    //this program only assigns a constant amount of variables, therefore the space complexity of the code is O(1)

}
