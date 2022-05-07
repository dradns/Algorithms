package com.dradns.algo;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str1_ok = "хъ{}[]<>";
        System.out.println("string1");
        StackL.checkBraces(str1_ok);
        System.out.println(StackL.checkBraces(str1_ok));


        String str2_ok = "[{45}]";
        System.out.println("string2");
        StackL.checkBraces(str2_ok);
        System.out.println(StackL.checkBraces(str2_ok));

        String str3_neok = "{[]fert";
        System.out.println("string3");
        StackL.checkBraces(str3_neok);
        System.out.println(StackL.checkBraces(str3_neok));

        String str4_neok = "{[]fert";
        System.out.println("string4");
        StackL.checkBraces(str4_neok);
        System.out.println(StackL.checkBraces(str4_neok));
    }
}
