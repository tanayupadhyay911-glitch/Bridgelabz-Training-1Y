package com.gla.GenericsAssignment.GenericsPro;

import java.util.*;

class CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for(Number num : src){
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(1,2,3);

        copyList(dest, src);

        System.out.println(dest);
    }
}
