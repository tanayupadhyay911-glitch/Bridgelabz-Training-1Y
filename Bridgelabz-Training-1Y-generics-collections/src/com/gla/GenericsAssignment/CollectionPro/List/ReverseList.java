package com.gla.GenericsAssignment.CollectionPro.List;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(arrayList);
        System.out.println("ArrayList: " + arrayList);

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverse(linkedList);
        System.out.println("LinkedList: " + linkedList);
    }

    public static <T> void reverse(List<T> list){
        int start = 0;
        int end = list.size()-1;

        while(start < end){
            T temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
