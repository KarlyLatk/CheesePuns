package org.example;

import java.util.Arrays;
import java.util.Objects;

public class CheeseParser {
    // Take a row of CSV data (string) and turn it into a Cheese Object
    public Cheese parse(String l) {
        // The array size matches the number of columns in the spreadsheet
        String[] cheeseProperties = new  String[13];
        // Replace null values with empty strings
        Arrays.fill(cheeseProperties, "");

        // Cleaned string has columns neatly separated by commas
        String [] ls = l.split(",");
        for(int i = 0; i < ls.length; i++){
            cheeseProperties[i] = ls[i];
        }

        return new Cheese(cheeseProperties[0], cheeseProperties[8], cheeseProperties[9], cheeseProperties[6], cheeseProperties[3]);



    }
}
