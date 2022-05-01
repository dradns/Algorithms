package com.dradns.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        LinkedListL ky = new LinkedListL();
        ky.addFirst(66);
        ky.addFirst(77);
        ky.addFirst(555);
        ky.addLast(1000);
        ky.addLast(2000);
        ky.addLast(3000);
        ky.addLast(4000);

//        ky.printOnlyValues();

//        ky.deleteFirst();
//        ky.printOnlyValues();
        ky.deleteLast();
        ky.printOnlyValues();
//        System.out.println(ky.indexOf(4000));
//        ky.printOnlyValues();
    }
}
