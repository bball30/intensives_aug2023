package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sequence.length(); i++) {
            if (!stack.empty()) {
                if (sequence.charAt(i) == '}' && (stack.peek() == ']' ||  stack.peek() == ')') ||
                        sequence.charAt(i) == ']' && (stack.peek() == '}' ||  stack.peek() == ')') ||
                        sequence.charAt(i) == ')' && (stack.peek() == ']' ||  stack.peek() == '}')) {
                    return false;
                }
                if (sequence.charAt(i) == '}' && stack.peek() == '{' ||
                        sequence.charAt(i) == ']' && stack.peek() == '[' ||
                        sequence.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
            } else {
                stack.push(sequence.charAt(i));
            }
        }
        return stack.empty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
