/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex41.base;

import java.util.ArrayList;

public class ListSorting {

    public void sortList (ArrayList<String> arrayIn){
        for (int i = 0; i < arrayIn.size(); i++) {
            for (int j = i + 1; j < arrayIn.size(); j++) {
                if (arrayIn.get(i).compareTo(arrayIn.get(j))>0) {
                    String tempVar = arrayIn.get(i);
                    arrayIn.set(i, arrayIn.get(j));
                    arrayIn.set(j, tempVar);
                }
            }
        }
    }
}
