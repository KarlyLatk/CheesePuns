package org.example;

public class Cheese {
    private String id;
    private String milkType;
    private String milkTreat;
    private String organic;
    private String moisturePercent;

    Cheese(String CheeseId, String MilkType, String MilkTreatmentType, String Organic, String MoisturePercentage) {
        id = CheeseId;
        milkType = MilkType;
        milkTreat = MilkTreatmentType;
        organic = Organic;
        moisturePercent = MoisturePercentage;
    }

    public double getMoisturePercent() {
        try {
            return Double.parseDouble(moisturePercent);
        } catch(Exception e){
            //System.out.println("Failed to parse " + moisturePercent + " of cheese " + id + " to a double");
        }
        // Workaround for exception handling
        return 0.0;
    }

    public boolean getOrganic() {
        // True if 1, false if not
        return organic.equals("1");
    }

    public String getMilkTreat() {
        return milkTreat;
    }

    public String getMilkType() {
        return milkType;
    }

    public String getId() {
        return id;
    }
}