package com.diwo;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<String> arrList = new ArrayList();
        arrList.addToFront("2");
        arrList.addToFront("3");
        arrList.addToBack("30");
        arrList.printt();

        String arg = (String) arrList.getBackingArray()[0];
        System.out.println(arg);

        // write your code here
    }
}
