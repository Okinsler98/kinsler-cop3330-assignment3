/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex43.base;


import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    private static String siteName = new String();
    private static String author = new String();
    private static String testString = new String();
    private static boolean jFileBool;
    private static boolean cFileBool;

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Solution43 solution43 = new Solution43();
        FileManager manager = new FileManager();

        solution43.userInput();

        manager.fileOutput(siteName, author, jFileBool, cFileBool);

    }

    public void userInput(){
        Solution43 solution = new Solution43();
        System.out.print("Site name: ");
        siteName = in.nextLine();
        System.out.print("Author: ");
        author = in.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        testString = in.nextLine();
        jFileBool = solution.inputTest(testString);

        System.out.print("Do you want a folder for CSS? ");
        testString = in.nextLine();
        cFileBool = solution.inputTest(testString);

    }

    public boolean inputTest (String input){
        if (input.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }
}