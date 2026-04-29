package com.gla.GenericsAssignment.CollectionPro.Queue;

import java.util.*;

class CircularBuffer {

    int[] arr;
    int size;
    int index = 0;

    CircularBuffer(int size){
        this.size = size;
        arr = new int[size];
    }

    void add(int val){
        arr[index] = val;
        index = (index+1)%size;
    }

    void print(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){

        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);

        cb.print();
    }
}
