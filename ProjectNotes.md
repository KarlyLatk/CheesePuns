Am I a Muenster for Making Cheese Puns (Java)
===

Write a Java program that reads in cheese data from a CSV file and then performs the calculations outlined in the Acceptance Criteria. Write the answers to the calculations in a new file called output.txt

# Acceptance Criteria
Read in the cheese dataset and then perform the following calculations. Write the answers to each of these calculations in a new file called output.txt


* Calculate the number of cheese that use pasteurized milk and the number of cheeses that use raw milk. 
The column containing this information is MilkTreatmentTypeEn.
* Calculate the number of organic cheese that have a moisture percentage greater than 41%. 
The columns representing these two pieces of information are Organic and MoisturePercent.
In this dataset, 0 means not organic while 1 means organic.
* Calculate which type of animal milk do most of the cheeses come from in Canada (cow, goat, ewe, or buffalo).
The column representing this information is MilkTypeEn.


## Dev Notes


* This dataset does not start from ID 1. Instead, it skips a couple of hundred IDs and starts in the middle. And
even then, it skips over IDs for cheeses that are no longer in production or are unreported.
* Some of the values are missing for rows in the dataset. You can omit those rows when you are performing the 
calculations.
* Feel free to open up this dataset in Excel and manually perform the calculations outlined in the Acceptance 
Criteria if you want to double-check your work. Just make sure that your Java program explicitly performs the 
calculations and saves the relevant results to a file called output.txt.

### What is our class doing?
* Reading data from a CSV file, row by row 
* Parsing the data and putting it into an array (or a list of arrays)
* Selecting specific "important" cells in each array
* Summing up / counting certain cells 
* Writing data to an output file