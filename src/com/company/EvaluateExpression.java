package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(ArrayList<String> A) {

        Stack<Integer> s = new Stack<>();

        for (String aA : A) {
            int t2;
            int t1;
            switch (aA) {
                case "+":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 + t2);
                    break;
                case "-":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 - t2);
                    break;
                case "*":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 * t2);
                    break;
                case "/":
                    t2 = s.pop();
                    t1 = s.pop();
                    s.push(t1 / t2);
                    break;
                default:
                    s.push(Integer.valueOf(aA));
            }
        }

        return s.pop();
    }
}
