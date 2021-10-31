package com.datastructures;

import java.util.Arrays;

public class ArrayReverse {
    
    //approach 1
  static void reverseArray(int arr[]) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    System.out.print(Arrays.toString(arr));
    System.out.println();
  }
    
    //approach 2
  static void reverseArray2(int arr[]) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    System.out.print(Arrays.toString(arr));
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6};
    int[] arr2 = {1, 2, 3, 4, 5, 6};
    reverseArray(arr);
    reverseArray2(arr2);
  }
}
