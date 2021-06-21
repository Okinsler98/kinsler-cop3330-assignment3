/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex44.base;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution44 {
    private Scanner in = new Scanner(System.in);
    private static String userString = new String();
    private static boolean repeatBool = false;

    public static void main(String[] args) throws FileNotFoundException {
        Solution44 app = new Solution44();
        JsonManager json = new JsonManager();

        json.JsonToGson();

        while (!repeatBool){
            userString = app.userInput();
            repeatBool = json.searchJson(userString);
        }

    }

    public String userInput (){
        System.out.print("What is the product name? ");
        String userIn = in.nextLine();
        return userIn;
    }
}
