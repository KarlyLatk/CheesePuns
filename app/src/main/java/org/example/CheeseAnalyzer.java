package org.example;

public class CheeseAnalyzer {
    public static void main (String[] args){
        // Read in the cheese data and turn it into a list of Cheese objects
        CheeseReader reader = new CheeseReader("cheese_data.csv");
        CheeseList list = reader.read_cheeses();

        // Perform whatever calculations we care about
        String output = Integer.toString(list.numberOfCheeses());

        // Write the cheese data to a file
        CheeseWriter writer = new CheeseWriter("output.txt");
        writer.write_data(output);

    }
}
