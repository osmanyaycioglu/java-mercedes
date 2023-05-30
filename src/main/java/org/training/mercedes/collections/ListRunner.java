package org.training.mercedes.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        String[] strs = new String[10];
        int[] ints = new int[10];
        Integer[] ios = new Integer[10];

        strs[0] = "osman";
        ints[0] = 100;
        ios[0] = 100;

        String[] newStrs = new String[15];
        System.arraycopy(strs,0,newStrs,0,strs.length);

        List<String> strList = new ArrayList<>();
        strList.add("osman");
        for (int i = 0; i < 100; i++) {
            strList.add("deneme" + i);
        }
        String s = strList.get(99);
        System.out.println(s);

        List<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(1002);
        intList.add(999);
        intList.add(88888);

        Integer integer = intList.get(1);
        try {
            Integer integer1 = intList.get(0);
            System.out.println("test satırı");
        } catch (Exception e) {
            System.out.println("Error oluştu");
            e.printStackTrace();
        }
        System.out.println("son satır");

        for (int i = 0; i < intList.size(); i++) {
            Integer iVal = intList.get(i);
            System.out.println("index : " + i + " value : " + iVal);
        }

        System.out.println("----------------");

        for (Integer xyz : intList) {
            System.out.println(" value : " + xyz);
        }

        System.out.println("----------------");

        intList.forEach(abc -> System.out.println("Value : " + abc));

        intList.remove(1);

        List<Long> ll = new ArrayList<>(1_000_000);
        for (long i = 0; i < 2_000_000; i++) {
            ll.add(i);
        }
        ll.clear();
        ll = null;
        System.gc();
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
        }

        List<Long> longs = new ArrayList<>(1_100_000);
        long delta = System.currentTimeMillis();
        for (long i = 0; i < 1_000_000; i++) {
            longs.add(i);
        }
        System.out.println("Add delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            longs.get(i);
        }
        System.out.println("Get delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (Long aLong : longs) {

        }
        System.out.println("Iterate delta : " + (System.currentTimeMillis() - delta));


        delta = System.currentTimeMillis();
        for (long i = 0; i < 1_000; i++) {
            longs.remove(i);
        }
        System.out.println("Remove delta : " + (System.currentTimeMillis() - delta));

    }
}
