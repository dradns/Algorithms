package com.dradns.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        LinkedListL ky = new LinkedListL();

        ky.addLast(1000);
        ky.addLast(2000);
        ky.addLast(3000);
        ky.addLast(4000);
        ky.addLast(5000);
        ky.addLast(6000);

        ky.reverse();
        ky.printOnlyValues();
    }
}
