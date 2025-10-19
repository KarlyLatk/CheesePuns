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

    public int calculateNumberofCheesesWithSomeProperty(){
        // iterate through your list
        int count = 0;
        for(Cheese cheese : cheeses){
            if(cheese.property == ""){
                count++;
            }
        }
        return count;
    }


}
