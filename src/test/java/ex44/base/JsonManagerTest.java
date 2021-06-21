/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex44.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JsonManagerTest {

    @Test
    void replace_word_replaces_correct_word() {

        JsonManager json = new JsonManager();

        String test = "{\n" +
                "  \"products\" : [\n" +
                "    {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Doodad\", \"price\": 5.00, \"quantity\": 10 }\n" +
                "  ]\n" +
                "}";

        String[] actual = new String[2];
        for (int i = 0; i < actual.length; i++){
            actual[i] = new String();
        }
        actual = json.jsonSeperator(test);

        String[] expected = new String[2];

        expected[0] = "\n" +
                "    {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 }";
        expected[1] = "\n" +
                "    {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 }";

        assertEquals(expected[1], actual[1]);
    }

    @Test
    void replace_word_replaces_correct_word_more() {

        JsonManager json = new JsonManager();

        String test = "{\n" +
                "  \"products\" : [\n" +
                "    {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 },\n" +
                "    {\"name\": \"Doodad\", \"price\": 5.00, \"quantity\": 10 }\n" +
                "  ]\n" +
                "}";

        String[] actual = new String[2];
        for (int i = 0; i < actual.length; i++){
            actual[i] = new String();
        }
        actual = json.jsonSeperator(test);

        String[] expected = new String[2];

        expected[0] = "\n" +
                "    {\"name\": \"Widget\", \"price\": 25.00, \"quantity\": 5 }";
        expected[1] = "\n" +
                "    {\"name\": \"Thing\", \"price\": 15.00, \"quantity\": 5 }";

        assertEquals(expected[0], actual[0]);
    }

}