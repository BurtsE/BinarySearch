package org.example;

import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        byte[] arr = new byte[]{1, 4, 6, 7, 8, 9, 10, 11, 12, 13};
        byte res = (byte) Arrays.binarySearch(arr, (byte) 6);
        System.out.println(res);
        res = (byte) Arrays.binarySearch(arr, (byte) 15);
        System.out.println(res);
        res = (byte) Arrays.binarySearch(arr, (byte) 5);
        System.out.println(res);
        Integer[] arr2 = new Integer[]{1, 4, 6, 7, 8, 9, 10, 11, 12, 13};
        res = (byte) Arrays.binarySearch(arr2, 5, 6, 7, new IntComparator());
        System.out.println(res);
    }
}