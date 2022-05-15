package com.dradns.algo;

import java.sql.Array;

public class SuperArrayL {
    public SuperArrayL(){
    }

    public static int[] superInsert(int[] arr, int number){
        int[] newArr = new int[arr.length+1];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = number;
        return newArr;
    }

    public static int[] superDelete(int[] arr, int index){
        if(index >= arr.length){
            int[] newArr;
             newArr = new int[1];
             newArr[0] = -1;
             return newArr;
        }

        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (i != index){
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

    public static int superIndexOf(int[] arr,int number){
        for (int i = 0; i < arr.length; i++){
            if (number == arr[i])
                return i;
        }
        return -1;
    }
}
