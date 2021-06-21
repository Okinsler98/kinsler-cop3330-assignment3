/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex45.base;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution45 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Solution45 app = new Solution45();
        FileManager file = new FileManager();
        WordFinder finder = new WordFinder();

        ArrayList inputText = file.inputFile();
        System.out.println(inputText);
        ArrayList outputText = finder.replaceWords(inputText);
        app.outputFile(outputText);

    }

    public void outputFile (ArrayList outputFileText) throws IOException {
        System.out.print("What should the output file name be? ");
        String outputFileName = in.nextLine();
        FileWriter fileOutput = new FileWriter(outputFileName + ".txt");

        String output = new String();

        for (int i = 0; i < outputFileText.size(); i++){
            output += outputFileText.get(i) + " ";
        }
        fileOutput.write(output);
        fileOutput.close();
    }
}
