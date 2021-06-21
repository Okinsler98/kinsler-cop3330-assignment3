/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex46.base;

import java.io.IOException;
import java.util.ArrayList;

public class Solution46 {

    public static void main(String[] args) throws IOException {
        FileManager file = new FileManager();
        CountWords counter = new CountWords();
        Solution46 app = new Solution46();

        ArrayList inputArray = file.inputFile();
        ArrayList uniqueWords = counter.findUniqueWords(inputArray);

        app.generateOutput(uniqueWords, inputArray);
    }

    public void generateOutput(ArrayList uniqueWords, ArrayList inputArray){
        CountWords counter = new CountWords();
        String output = new String();

        for (int i = 0; i < uniqueWords.size(); i++){
            System.out.format("%1$-10s", uniqueWords.get(i) + ":");
            int countUnique = counter.countUniqueWords(inputArray, (String) uniqueWords.get(i));
            for (int j = 0; j < countUnique; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
