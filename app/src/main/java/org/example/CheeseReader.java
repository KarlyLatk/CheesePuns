package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader {
    private String filename;
    private CheeseParser parser = new CheeseParser();
    private CheeseRowCleaner cleaner = new CheeseRowCleaner();

    public CheeseReader(String inputFilename){
        filename = inputFilename;
    }

    // Read in all the data from the file
    public CheeseList read_cheeses(){
        CheeseList list = new CheeseList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null){
                Cheese cheese = deserialize_cheese(line);
                list.addCheese(cheese);
            }
            br.close();

        } catch(Exception e){
            System.out.println("Error while reading cheeses from "+filename);
        }
        return list;
    }

    // Clean a row of data and make it a cheese
    private Cheese deserialize_cheese(String line){
        String cleaned_line = cleaner.clean(line);
        return parser.parse(cleaned_line);
    }
}
