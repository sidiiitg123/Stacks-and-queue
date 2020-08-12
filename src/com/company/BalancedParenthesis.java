package com.company;

import java.util.Stack;

public class BalancedParenthesis {

    public int solve(String A) {

        Stack<Character> mystack=new Stack<>();

        if(A.length()==0 || A==null){
            return 0;
        }
        for(int i=0;i<A.length();i++){
            Character c=A.charAt(i);
            if(c=='('){
                mystack.push(c);
            }else if(c==')'){
                if(!mystack.isEmpty()&& mystack.peek()=='('){
                    mystack.pop();
                }else{
                    return 0;
                }
            }
        }
        if(mystack.isEmpty()){
            return 1;
        }else {
            return 0;
        }

    }
}
