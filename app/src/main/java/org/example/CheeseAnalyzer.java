package org.example;

public class CheeseAnalyzer {
    public static void main (String[] args){
        // Read in the cheese data and turn it into a list of Cheese objects
        CheeseReader reader = new CheeseReader("cheese_data.csv");
        CheeseList list = reader.read_cheeses();

        // Perform calculations to get outputs
        String cheeseCount = Integer.toString(list.numberOfCheeses());
        String pasteurized = Integer.toString(list.calculateNumberOfPasteurizedCheeses());
        String rawMilk = Integer.toString(list.calculateNumberOfRawMilkCheeses());
        String moisture = Integer.toString(list.calculateNumberOfMoisturePercentage());
        String milkType = list.mostCommonMilkType();
        String avgMoisture = Double.toString(list.calculateAverageMoisturePercentage());

        // Write the cheese data to a file
        CheeseWriter writer = new CheeseWriter("output.txt");
        writer.write_data("Total cheeses: " + cheeseCount + "\n" +
                                "Pasteurized: " + pasteurized + "\n" +
                                "Raw milk: " + rawMilk + "\n" +
                                "Organic moist: " + moisture + "\n" +
                                "Most common milk type: " + milkType + "\n" +
                                "Average moisture: " + avgMoisture);
        /* Should be:
        1043
        800
        115
        53
        Cow
        47.069747
        * */
    }
}
