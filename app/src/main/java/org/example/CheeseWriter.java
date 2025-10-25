package org.example;

import java.io.FileOutputStream;
import java.io.FileWriter;


// Manage the writing of cheese data to a new file
public class CheeseWriter {
   private String filename;
   public CheeseWriter(String filename){
        this.filename = filename;
   }

   public void write_data(String string){
       try {
           FileOutputStream fw = new FileOutputStream(filename);
           byte[] stringBytes = string.getBytes();
           fw.write(stringBytes);
           fw.close();
       }catch (Exception e){
           System.out.println("Error while writing to "+filename +": "+e.getMessage());
       }
   }

}
