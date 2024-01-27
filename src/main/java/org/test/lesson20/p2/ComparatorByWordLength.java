package org.test.lesson20.p2;

import java.util.Comparator;

public class ComparatorByWordLength implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int result = o1.length() - o2.length();
        if (result == 0){
            result = o1.compareTo(o2);
        }
        return result;
    }
}
