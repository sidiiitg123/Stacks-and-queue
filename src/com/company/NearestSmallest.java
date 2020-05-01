package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallest {

    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> r = new ArrayList<>();
        if(A.size()==0){
            return r;
        }

        r.add(-1);
        Stack<Integer> s = new Stack<>();
        s.push(A.get(0));
        for(int i=1;i<A.size();i++){

            while(!s.empty() && s.peek()>=A.get(i)){
                s.pop();
            }

            if(s.empty()){
                r.add(-1);
            }
            else{
                r.add(s.peek());
            }
            s.push(A.get(i));
        }

        return r;
    }
}
