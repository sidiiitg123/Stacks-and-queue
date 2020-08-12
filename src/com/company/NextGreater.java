package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {

        ArrayList<Integer> output = new ArrayList<>(A.size());
        Stack<Integer> mystack = new Stack<>();

        if(A==null){
            return new ArrayList<>();
        }

        int next = 0;
        for (int i = 0; i < A.size(); i++) {
            next = A.get(i);
            if (mystack.isEmpty() || next < mystack.peek()) {
                mystack.push(next);
                continue;
            }
            while (!mystack.isEmpty() && next > mystack.peek()) {
                output.add(A.indexOf(mystack.peek()), next);
                mystack.pop();
            }
            mystack.push(next);
        }
        if (!mystack.isEmpty()) {
            output.add(A.indexOf(mystack.peek()), -1);
            mystack.pop();
        }
        return output;
    }
}
