package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        if(A==null||A.size()==0)
            return new ArrayList<>(0);

        ArrayList<Integer> myarr=new ArrayList<>(A.size()-B+1);

        LinkedList<Integer> deque = new LinkedList<Integer>();
        for(int i=0; i<A.size(); i++){
            if(!deque.isEmpty()&&deque.peekFirst()==i-B)
                deque.poll();

            while(!deque.isEmpty()&&A.get(deque.peekLast())<A.get(i)){
                deque.removeLast();
            }

            deque.offer(i);

            if(i+1>=B)
                myarr.set((i+1-B),A.get(deque.peek()));
        }

        return myarr;
    }
}
