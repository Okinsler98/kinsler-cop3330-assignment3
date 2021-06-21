/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex45.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void replace_word_replaces_correct_word() {

        WordFinder finder = new WordFinder();

        ArrayList<String> actualList = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("utilize");
                add("do");
                add("for");
                add("why");
            }
        };

        ArrayList actual = finder.replaceWords(actualList);

        ArrayList<String> expected = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("use");
                add("do");
                add("for");
                add("why");
            }
        };

        assertEquals(expected, actual);
    }

    @Test
    void replace_word_replaces_correct_word_plural() {

        WordFinder finder = new WordFinder();

        ArrayList<String> actualList = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("utilizes");
                add("do");
                add("for");
                add("why");
            }
        };

        ArrayList actual = finder.replaceWords(actualList);

        ArrayList<String> expected = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("uses");
                add("do");
                add("for");
                add("why");
            }
        };

        assertEquals(expected, actual);
    }

    @Test
    void replace_word_replaces_correct_quotes() {

        WordFinder finder = new WordFinder();

        ArrayList<String> actualList = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("\"utilize\"");
                add("do");
                add("for");
                add("why");
            }
        };

        ArrayList actual = finder.replaceWords(actualList);

        ArrayList<String> expected = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("\"use\"");
                add("do");
                add("for");
                add("why");
            }
        };

        assertEquals(expected, actual);
    }

    @Test
    void replace_word_replaces_correct_quotes_and_plural() {

        WordFinder finder = new WordFinder();

        ArrayList<String> actualList = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("\"utilizes\"");
                add("do");
                add("for");
                add("why");
            }
        };

        ArrayList actual = finder.replaceWords(actualList);

        ArrayList<String> expected = new ArrayList<String>(){
            {
                add("Word");
                add("Words");
                add("\"uses\"");
                add("do");
                add("for");
                add("why");
            }
        };

        assertEquals(expected, actual);
    }
}