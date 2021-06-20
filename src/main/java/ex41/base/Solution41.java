/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex41.base;

import java.io.IOException;
import java.util.ArrayList;

public class Solution41 {

    public static void main(String[] args) throws IOException {
        FileManager manager = new FileManager();
        ListSorting sorter = new ListSorting();
        ArrayList<String> nameList = new ArrayList<>();

        manager.inputFile(nameList);
        sorter.sortList(nameList);
        String output = generateOutput(nameList);

        manager.outputString(output);
    }

    public static String generateOutput(ArrayList<String> arrayIn){
        String output = "Total of " + arrayIn.size() + " names\n-----------------\n";
        for (int i = 0; i < arrayIn.size(); i++){
            output += arrayIn.get(i);
            output += "\n";
        }
        return output;
    }
}
