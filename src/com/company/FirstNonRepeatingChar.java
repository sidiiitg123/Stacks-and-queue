package com.company;

import java.util.*;

public class FirstNonRepeatingChar {

    public String solve(String A) {

        StringBuilder s=new StringBuilder();
       Deque<Character> myQue=new LinkedList<>();
       int[] myarr=new int[26];
       int i=0;
       while(i<A.length()){

           char c=A.charAt(i);
           myarr[c-'a']=myarr[c-'a']+1;

           myQue.add(c);

           while(!myQue.isEmpty()){
               if(myarr[myQue.peekFirst()-'a']>1){
                   myQue.pop();
               }else{
                   s.append(myQue.peekFirst());
                   break;
               }
           }
           if(myQue.isEmpty())
               s.append('#');

           i++;
       }
       return s.toString();
    }
}
