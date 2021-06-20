/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListSortingTest {

    ArrayList<String> actualList = new ArrayList<String>(){
        {
            add("Zoom");
            add("Cat");
            add("Bad");
            add("Adopt");
        }
    };

    ArrayList<String> expectedList = new ArrayList<String>(){
        {
            add("Adopt");
            add("Bad");
            add("Cat");
            add("Zoom");
        }
    };

    @Test
    void sortTesting_ouput_sorted_arrayList() {

        ListSorting sorter = new ListSorting();

        sorter.sortList(actualList);

        assertEquals(expectedList, actualList);
    }
}