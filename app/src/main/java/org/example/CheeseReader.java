package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader {
    private String filename;

    public CheeseReader(String inputFilename){
        filename = inputFilename;
    }

    // Take a row of CSV data (string) and turn it into a Cheese Object
    public Cheese cheeseParser(String l){
        // take l and figure out the cheese id, milk type, and property
        Cheese cheese = new Cheese("", "", "");
        return cheese;

    }
    // Take in a line and return the line
    public String cheeseRowCleaner(String line){
        return line;
    }

    public CheeseList read_cheeses(){
        CheeseList list = new CheeseList();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null){
                Cheese cheese = deserilize_cheese(line);
                list.addCheese(cheese);
            }
            br.close();

        }catch(Exception e){
            // Do something here
        }
        return list;
    }
    private Cheese deserilize_cheese(String line){
        String cleaned_line = cheeseRowCleaner(line);
        Cheese cheese = cheeseParser(cleaned_line);
        return cheese;
    }
}
