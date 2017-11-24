package com.hillel;

public class BinarySearch {

  public static boolean findNumber(int[] array, int number) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        return true;
      }
    }
    return false;
  }

  int[] array = new int[5];


  public static boolean findNumberOptimized(int[] array, int number) {

    int start = 0;
    int finish = array.length;

    int current;

    while (start != finish) {
      current = (start + finish) / 2;
      if (array[current] == number) {
        return true;
      }

      if (array[current] < number) {
        start = current ;
      } else {
        finish = current;
      }
    }
    return false;
  }

}
