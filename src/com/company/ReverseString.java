package com.company;

import java.util.Stack;

public class ReverseString {
    public String reverseString(String A) {

        Stack<Character> mystack= new Stack<>();
        String str="";
        if(A.isEmpty()){
            return "";
        }
        for(char c:A.toCharArray()){
            mystack.push(c);
        }
        while(!mystack.isEmpty()){
            char c=mystack.pop();
            str+=Character.toString(c);

        }
        return str;
    }
}
