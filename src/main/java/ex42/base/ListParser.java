/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex42.base;

import java.util.ArrayList;

public class ListParser {

    public void parseString(ArrayList<String> arrayIn[], int parseNum, String inputString){
        String output = new String();

        for (int i = 0; i < inputString.length(); i++){
            if (inputString.charAt(i) == ','){
                arrayIn[parseNum].add(output);
                output = "";
                i++;
            } else if (i == inputString.length()-1){
                output += inputString.charAt(i);
                arrayIn[parseNum].add(output);
                break;
            }
            output += inputString.charAt(i);
        }
    }
}
