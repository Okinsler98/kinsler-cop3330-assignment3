/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex42.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public void inputFile(ArrayList<String> arrayIn[]) throws FileNotFoundException {
        File fileInput = new File("D:\\cop3330\\programming-exercises\\kinsler-cop3330-assignment3\\src\\main\\java\\ex42\\base\\exercise42_input.txt");
        ListParser parser = new ListParser();

        Scanner fileReader = new Scanner(fileInput);

        int counter = 0;
        String temp;

        while (fileReader.hasNextLine()) {
            temp = fileReader.nextLine();
             parser.parseString(arrayIn, counter, temp);
             counter++;
        }
    }
}
