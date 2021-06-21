/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex46.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CountWordsTest {

    @Test
    void Count_Unique_words_returns_true_majority() {

        CountWords counter = new CountWords();

        ArrayList<String> actualList = new ArrayList<String>(){
            {
                add("Words");
                add("Words");
                add("Words");
                add("Words");
                add("Words");
                add("Dave");
            }
        };

        int actual = counter.countUniqueWords(actualList, "Words");

        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void Count_Unique_words_returns_true_minority() {

        CountWords counter = new CountWords();

        ArrayList<String> actualList = new ArrayList<String>(){
            {
                add("Words");
                add("Words");
                add("Words");
                add("Words");
                add("Words");
                add("Dave");
            }
        };

        int actual = counter.countUniqueWords(actualList, "Dave");

        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void find_unique_words_returns_unique_words() {

        CountWords counter = new CountWords();

        ArrayList<String> testList = new ArrayList<String>(){
            {
                add("Words");
                add("Words");
                add("Words");
                add("Words");
                add("Words");
                add("Dave");
            }
        };

        ArrayList actualList = counter.findUniqueWords(testList);

        ArrayList<String> expectedList = new ArrayList<String>(){
            {
                add("Words");
                add("Dave");
            }
        };

        assertEquals(expectedList, actualList);
    }
}