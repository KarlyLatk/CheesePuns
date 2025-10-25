package org.example;

import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese){
        cheeses.add(cheese);
    }

    public int numberOfCheeses(){
        return cheeses.size();
    }

    // Calculate the number of pasteurized cheeses
    public int calculateNumberOfPasteurizedCheeses(){
        int numOfPasteurized = 0;

        // Iterate through the list
        for(Cheese cheese : cheeses){
            //System.out.println(cheese.getMilkTreat());
            if(cheese.getMilkTreat().equals("Pasteurized")){
                numOfPasteurized++;
            }
        }
        return numOfPasteurized;
    }

    // Calculate the number of raw milk cheeses
    public int calculateNumberOfRawMilkCheeses(){
        int numOfRawMilk = 0;

        // Iterate through the list
        for(Cheese cheese : cheeses){
            if(cheese.getMilkTreat().equals("Raw Milk")){
                numOfRawMilk++;
            }
        }
        return numOfRawMilk;
    }

    // Calculate the number of organic cheeses that have a moisture percentage greater than 41.0%
    public int calculateNumberOfMoisturePercentage(){
        int numOfMoist = 0;

        // Iterate through the list
        for(Cheese cheese : cheeses){
            if(cheese.getOrganic() && cheese.getMoisturePercent() > 41.0){
                numOfMoist++;
            }
        }
        return numOfMoist;
    }

    // Calculate which type of milk do most cheeses come from in Canada
    public String mostCommonMilkType(){
        int cow = 0;
        int goat = 0;
        int ewe = 0;
        int buffalo = 0;

        // Iterate through the list
        for(Cheese cheese : cheeses){
            if(cheese.getMilkType().equals("Cow")){
                cow++;
            }
            if(cheese.getMilkType().equals("Goat")){
                goat++;
            }
            if(cheese.getMilkType().equals("Ewe")){
                ewe++;
            }
            if(cheese.getMilkType().equals("Buffalo")){
                buffalo++;
            }
        }
        int max = Math.max(Math.max(Math.max(cow, goat), ewe), buffalo);
        if(max == cow){
            return "Cow";
        }
        if(max == goat){
            return "Goat";
        }
        if(max == ewe){
            return "Ewe";
        }
        return "Buffalo";

    }

    //Calculate the average moisture percentage
    public double calculateAverageMoisturePercentage() {
        // Keep track of how many cheeses have a moisture percentage
        int cheeseCount = 0;
        double total = 0.0;

        // Iterate through the list
        for(Cheese cheese : cheeses) {
            double mp = cheese.getMoisturePercent();
            if(mp > 0.0) {
                cheeseCount++;
            }
            total = total + mp;
        }

        return total/cheeseCount;
    }

    // Calculate which ids are missing from the list
    public String calculateMissingIds() {
        // Iterate through the list
        for(Cheese cheese : cheeses) {

        }
        return "";
    }

    // Calculate which cheeses are lactic
    public String calculateLacticCheeses() {
        // Iterate through the list
        for(Cheese cheese : cheeses) {

        }
        return "";
    }
}
