package com.dradns.algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var superArray = new SuperArray();
        int[] testArr = {1, 5, 7, 10, 9};
//        System.out.println(SuperArray.superIndexOf(testArr,1));
//        System.out.println(Arrays.toString(SuperArray.superInsert(testArr,677)));
          System.out.println(Arrays.toString(SuperArray.superDelete(testArr,0)));
          var res = SuperArray.superDelete(testArr,0).length;
          System.out.println(res);
    }
}
