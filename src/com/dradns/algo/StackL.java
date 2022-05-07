package com.dradns.algo;
import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class StackL {
    static Stack stack = new Stack();
    static char openB1 = '<';
    static char openB2 = '{';
    static char openB3 = '[';

    static char closeB1 = '>';
    static char closeB2 = '}';
    static char closeB3 = ']';

    public static String reverseString(@NotNull String str) {
        var stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        var reversed = new StringBuffer();
        while (!stack.empty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static boolean checkBraces(@NotNull String str) {
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != openB1 && str.charAt(i) != openB2 && str.charAt(i) != openB3 && str.charAt(i) != closeB1 && str.charAt(i) != closeB2 && str.charAt(i) != closeB3) {
                i++;
            } else if (str.charAt(i) == openB1 || str.charAt(i) == openB2 || str.charAt(i) == openB3) {
                stack.push(str.charAt(i));
                i++;
            } else if (str.charAt(i) == closeB1 || str.charAt(i) == closeB2 || str.charAt(i) == closeB3) {
                if (stack.empty()){
                    return false;
                }

                if (!isClose(str.charAt(i))){
                    return false;
                }
                i++;
            }
        }
        return stack.empty();
    }

    private static boolean isClose(char c) {
        if(c == closeB1){
            return stack.pop().equals(openB1);
        }else if(c == closeB2){
            return stack.pop().equals(openB2);
        }else if(c == closeB3){
            return stack.pop().equals(openB3);
        }
        return true;
    }
}