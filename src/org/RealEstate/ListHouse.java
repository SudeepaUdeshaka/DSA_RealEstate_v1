/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.RealEstate;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListHouse {
    String ln;
    String fNm; 
    String lNm; 
    String price; 
    String sqFt; 
    String noBeds;
    
    public void copy() throws IOException
    {
         try {
             try (BufferedReader in = new BufferedReader(new FileReader("DataFile.txt"))) {
                 String str;

                     str = in.readLine();
                     String[] ar=str.split("@");
                     
                     System.out.println(str); 
                     ln = ar[0].toString();
                     fNm=ar[1].toString();
                     lNm=ar[2].toString();
                     price = ar[3].toString();
                     sqFt = ar[4].toString();
                     noBeds= ar[5].toString();
             } 

          } catch (FileNotFoundException ex) {            
            Logger.getLogger(ListHouse.class.getName()).log(Level.SEVERE, null, ex);
        }            
            

       
    }
    public void compareTo(String lotNum)
    {
          try (BufferedReader in = new BufferedReader(new FileReader("DataFileSorted.txt"))) {
        try {
                String str;
                
                
                while ((str = in.readLine())!=null) {
                    String[] ar;
                    ar = str.split("@");
                    if((Integer.parseInt(ar[0]))>(Integer.parseInt(lotNum)))
                    {
                        ln = ar[0].toString();
                        fNm=ar[1].toString();
                        lNm=ar[2].toString();
                        price = ar[3].toString();
                        sqFt = ar[4].toString();
                        noBeds= ar[5].toString();
                        break;
                    }
                    
                }
             
        } catch (IOException e) {
            System.out.println("File Read Error");
        }

         
    }catch(Exception e){
    e.printStackTrace();
    }
        
        
        
        
    }
    
}
