
package org.RealEstatev01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortedList {

public void Listable()
    {

 String line = "";
         BufferedReader r = null;
        try {
            r = new BufferedReader(new FileReader("DataFile.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SortedList.class.getName()).log(Level.SEVERE, null, ex);
        }ArrayList al = new ArrayList();
        try {
            while ((line = r.readLine()) != null)
                
                al.add(line);
        } catch (IOException ex) {
            Logger.getLogger(SortedList.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            r.close();
        } catch (IOException ex) {
            Logger.getLogger(SortedList.class.getName()).log(Level.SEVERE, null, ex);
        }
        Collections.sort(al);
        for (int i=0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
            try(PrintWriter output = new PrintWriter(new FileWriter("DataFileSorted.txt",true))) {
                            output.printf("%s\r\n",al.get(i));
                        } 
                        catch (Exception e) {}
        }
            
        
    }
}
