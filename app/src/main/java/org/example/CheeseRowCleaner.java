package org.example;

public class CheeseRowCleaner {
    public String clean(String line) {
        StringBuilder sb = new StringBuilder(line);

        // Remove extra commas and all quotation marks
        boolean inQuotes = false;
        for(int i = 0; i < line.length(); i++) {
            // Toggle inQuotes when a quotation mark is hit
            if(line.charAt(i) == '"') {
                inQuotes = !inQuotes;

                // Also remove the quotation mark
                sb.setCharAt(i, ' ');
            }

            if(inQuotes) {
                if(line.charAt(i) == ',') {
                    // Remove commas inside quotation marks
                    sb.setCharAt(i, ' ');
                }
            }
        }

        return sb.toString();
    }
}
