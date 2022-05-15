package com.dradns.algo;

import java.sql.Array;
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

    public static void put(Entry entry){
        //получить ячейку массива
        //проверить, что массив существует

    }

    private static Integer getArrPlace(Integer key){
        return Math.abs(key) % 10;
    }

    private static boolean isListExist(Integer key){
        return baseArray[key] != null;
    }

    public static LinkedList getList(int i){
        return baseArray[i];
    }
}

class Entry {
    public Integer key;
    public String value;
}


//DONE - создать массив линкед листов
//DONE - создать сущность кей-вэлью
//DONE - создать элементарную хэш-функцию %10