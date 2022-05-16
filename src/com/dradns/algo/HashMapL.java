package com.dradns.algo;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class HashMapL{
    private static LinkedList[] baseArray = new LinkedList[10];

    private static int hashFunc(int key){
        return key%10;
    }

//    public static String get(int key){
//
//    }
//
//    public static String remove(int key){
//
//    }

    public static void put(Integer key, String value){
        Entry entry = new Entry(key, value);
        int arrPlace = getArrPlace(entry.key);
        System.out.println(arrPlace + " its arrPlace");
        if (!isListExist(arrPlace)){
            baseArray[arrPlace] = new LinkedList();
            baseArray[arrPlace].add(entry);
        }else {
            baseArray[arrPlace].add(entry);
        }
    }

    private static Integer getArrPlace(Integer key){
        return Math.abs(key) % 10;
    }

    private static boolean isListExist(Integer key){
        return baseArray[key] != null;
    }

    public static LinkedList getList(int i){
        System.out.println((Arrays.toString(baseArray[i].toArray())));
        System.out.println(baseArray[i].size() + " its bucket size");
        return baseArray[i];
    }
}

class Entry {
    public Integer key;
    public String value;

    public Entry(Integer key, String value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return "key = " + this.key + " value = " + this.value;
    }
}
