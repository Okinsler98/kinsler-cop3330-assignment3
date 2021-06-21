/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex46.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public ArrayList inputFile() throws FileNotFoundException {
        File fileInput = new File("D:\\cop3330\\programming-exercises\\kinsler-cop3330-assignment3\\src\\main\\java\\ex46\\base\\exercise46_input.txt");
        ArrayList output = new ArrayList();
        Scanner fileReader = new Scanner(fileInput);

        while (fileReader.hasNextLine()) {
            output.add(fileReader.next());
        }
        return output;
    }
}
