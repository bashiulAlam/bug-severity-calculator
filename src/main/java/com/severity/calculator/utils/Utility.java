package com.severity.calculator.utils;

import java.util.ArrayList;

public class Utility {
    public static String[] arrayListToStrArrayConverter(ArrayList<String> arrayList) {
        String[] strList = new String[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            strList[i] = arrayList.get(i);
        }

        return  strList;
    }

    public static boolean isInBetween(int num, int minRange, int maxRange) {
        if (num >= minRange && num <= maxRange)
            return true;
        else return false;
    }
}
