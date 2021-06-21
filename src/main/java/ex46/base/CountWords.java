/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex46.base;

import java.util.ArrayList;

public class CountWords {

    public ArrayList findUniqueWords(ArrayList arrayIn){
        ArrayList output = new ArrayList();

        for (int i = 0; i <  arrayIn.size(); i++){
            if(!output.contains(arrayIn.get(i))){
                output.add(arrayIn.get(i));
            }
        }

        return output;
    }

    public int countUniqueWords(ArrayList arrayIn, String searchWord){
        int output = 0;
        while (arrayIn.contains(searchWord)){
            arrayIn.remove(searchWord);
            output++;
        }
        return output;
    }
}
