/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex42.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListParserTest {

    @Test
    void sortTesting_ouput_sorted_arrayList() {

        ListParser parser = new ListParser();
        ArrayList<String> actualList[] = new ArrayList[1];

        ArrayList<String> expectedList = new ArrayList<String>(){
            {
                add("123");
                add("2");
                add("003");
                add("4");
                add("58798");
                add("61");
            }
        };

        for (int i = 0; i < actualList.length; i++){
            actualList[i] = new ArrayList<>();
        }

        String actual = "123,2,003,4,58798,61";

        parser.parseString(actualList, 0, actual);

        assertEquals(expectedList, actualList[0]);
    }
}