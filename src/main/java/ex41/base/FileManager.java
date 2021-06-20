/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex41.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public void inputFile(ArrayList<String> arrayIn) throws FileNotFoundException {
        File fileInput = new File("D:\\cop3330\\programming-exercises\\kinsler-cop3330-assignment3\\src\\main\\java\\ex41\\base\\exercise41_input.txt");

        Scanner fileReader = new Scanner(fileInput);

        while (fileReader.hasNextLine()) {
             arrayIn.add(fileReader.nextLine());
        }
    }

    public void outputString(String outputString) throws IOException {
        FileWriter fileOutput = new FileWriter("D:\\cop3330\\programming-exercises\\kinsler-cop3330-assignment3\\src\\main\\java\\ex41\\base\\exercise41_output.txt");

        fileOutput.write(outputString);
        fileOutput.close();
    }
}
