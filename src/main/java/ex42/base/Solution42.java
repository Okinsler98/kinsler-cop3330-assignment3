/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex42.base;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Solution42 {

    public static void main(String[] args) throws FileNotFoundException {
        FileManager manager = new FileManager();
        ArrayList<String>[] inputList = new ArrayList[7];

        for (int i = 0; i < inputList.length; i++){
            inputList[i] = new ArrayList<>();
        }

        manager.inputFile(inputList);

        printOutput(inputList);
    }

    public static void printOutput(ArrayList<String> arrayIn[]){
        System.out.format("%1$-10s%2$-10s%3$-10s\n--------------------------\n", "Last", "First", "Salary");
        for (int i = 0; i < arrayIn.length; i++){
            System.out.format("%1$-10s%2$-10s%3$-10s\n", arrayIn[i].get(0), arrayIn[i].get(1), arrayIn[i].get(2));
        }
    }
}
