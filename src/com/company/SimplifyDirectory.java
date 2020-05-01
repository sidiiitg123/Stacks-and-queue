package com.company;

import java.util.Stack;

public class SimplifyDirectory {
    public String simplifyPath(String A) {

        if(A.equals(""))
            return "";

        Stack<String> myStack=new Stack<>();
        Stack<String> mystack2=new Stack<>();

        String[] myStrArr=A.split("/");
        String str="";
        for(String s:myStrArr){
            if(!myStack.isEmpty() && s.equals("..")){
                myStack.pop();
            }else if(!s.equals(".") && !s.equals("") && !s.equals("..")){
                myStack.push(s);
            }
        }
        if(myStack.isEmpty()){
            return "/";
        }else{
            while(!myStack.isEmpty()){
              String s1=myStack.pop();
              mystack2.push(s1);
            }
            while(!mystack2.isEmpty()){
                String poppedVal=mystack2.pop();
                str=str+"/"+poppedVal;
            }
        }

        return str;
    }
}
