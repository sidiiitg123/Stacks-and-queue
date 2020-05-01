package com.company;

import java.util.Stack;

public class AllParenthesis {

    public int isValid(String A) {

        String opening = "({[";
        String closing = ")}]";

        Stack<Character> mystack = new Stack<>();

        for (char c : A.toCharArray()) {
            if (opening.indexOf(c) != -1) {
                mystack.push(c);
            } else {
                if (mystack.isEmpty()) {
                    return 0;
                }
                char c2 = mystack.pop();
                if (opening.indexOf(c2)!=closing.indexOf(c)){
                    return 0;
                }
            }
        }
        return mystack.isEmpty()==true?1:0;
    }
}
