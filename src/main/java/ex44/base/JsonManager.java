/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Orion Kinsler
 */

package ex44.base;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JsonManager {
    File fileInput = new File("D:\\cop3330\\programming-exercises\\kinsler-cop3330-assignment3\\src\\main\\java\\ex44\\base\\exercise44_input.json");
    class Products{
        private String name;
        private double price;
        private int quantity;
    }

    Products items[] = new Products[3];

    public void JsonToGson () throws FileNotFoundException {
        Scanner in = new Scanner(fileInput);
        JsonManager manager = new JsonManager();
        Gson gson = new Gson();
        String json = new String();

        while (in.hasNextLine()){
            json += in.next();
        }

        String[] jsonArray = manager.jsonSeperator(json);

        for (int i = 0; i < 3; i++){
            items[i] = gson.fromJson(jsonArray[i], Products.class);
        }
    }

    public String[] jsonSeperator (String json){
        int inventoryCounter = 0;
        boolean ignoreStart = false;
        String[] output = new String[5];

        for (int i = 0; i  < output.length; i++){
            output[i] = new String();
        }

        for (int i = 0; i  < json.length(); i++){
            if (ignoreStart){
                output[inventoryCounter] += json.charAt(i);
            }
            if (json.charAt(i) == '['){
                ignoreStart = true;
            }
            if (json.charAt(i) == '}'){
                inventoryCounter++;
                i++;
            }
        }
        return output;
    }

    public boolean searchJson (String item){
        for (int i = 0; i < items.length; i++){
            if (items[i].name.equalsIgnoreCase(item)){
                System.out.println("Name: " + items[i].name);
                System.out.println("Price: " + items[i].price);
                System.out.println("Quantity: " + items[i].quantity);
                return true;
            }
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }
}
