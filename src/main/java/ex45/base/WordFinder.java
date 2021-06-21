/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex45.base;

import java.util.ArrayList;

public class WordFinder {

    public ArrayList replaceWords(ArrayList inputArray){

        changeWord("utilize", "use", inputArray);

        return inputArray;
    }

    public void changeWord (String remove, String replace, ArrayList arrayIn){
        if (arrayIn.contains(remove)){
            arrayIn.set(arrayIn.indexOf(remove), replace);
            changeWord(remove, replace, arrayIn);
        }
        if (arrayIn.contains(remove + "s")){
            arrayIn.set(arrayIn.indexOf(remove + "s"), replace + "s");
            changeWord(remove, replace, arrayIn);
        }

        if (arrayIn.contains("\"" + remove  + "\"")){
            arrayIn.set(arrayIn.indexOf("\"" + remove  + "\""), "\"" + replace  + "\"");
            changeWord(remove, replace, arrayIn);
        }

        if (arrayIn.contains("\"" + remove + "s" + "\"")){
            arrayIn.set(arrayIn.indexOf("\"" + remove + "s" + "\""), "\"" + replace + "s" + "\"");
            changeWord(remove, replace, arrayIn);
        }
    }
}
