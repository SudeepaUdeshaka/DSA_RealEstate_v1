/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.RealEstate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HouseFile {
    public String lotnnn;
        public String fNm;
        public String lNm;
        public String price;
        public String sqFt;
        public String noBeds;

    public int save(String lotNumber,String firstName,String lastName,String price,String squareFeet,String noOfBedrooms)
    {
        
        try(PrintWriter output = new PrintWriter(new FileWriter("DataFile.txt",true))) 
    {
        output.printf("%s\r\n",lotNumber+"@"+firstName+"@"+lastName+"@"+price+"@"+squareFeet+"@"+noOfBedrooms);
        return 1;
    } 
catch (Exception e) 
    {
        return 0;
    }
    }
    
    /**
     *
     * @param lotNo
     */
    public void find(String lotNo)
    {
            try (BufferedReader in = new BufferedReader(new FileReader("DataFile.txt"))) {
        try {
                String str;
                
                
                while ((str = in.readLine())!=null) {
                    String[] ar;
                    ar = str.split("@");
                    if(ar[0].toString().equals(lotNo))
                    {
                                  
                        fNm=ar[1].toString();
                        lNm=ar[2].toString();
                        price = ar[3].toString();
                        sqFt = ar[4].toString();
                        noBeds= ar[5].toString();
                        
                    }
                    
                }
             
        } catch (IOException e) {
            System.out.println("File Read Error");
        }

         
    }catch(Exception e){
    e.printStackTrace();
    }
            }
            
            
    
    public void delete(String lotNo)
    {
        File inputFile = new File("DataFile.txt");
        File tempFile = new File("DataFile1.txt");
        try {
            try (BufferedReader in = new BufferedReader(new FileReader("DataFile.txt"))){             
                String str;         
                
                while ((str = in.readLine())!=null) {
                    String[] ar=str.split("@");
                    if(!ar[0].toString().equals(lotNo))
                    {
                        lotnnn= ar[0].toString();
                        fNm=ar[1].toString();
                        lNm=ar[2].toString();
                        price = ar[3].toString();
                        sqFt = ar[4].toString();
                        noBeds= ar[5].toString();
                        
                        try(PrintWriter output = new PrintWriter(new FileWriter("DataFile1.txt",true))) {
                            output.printf("%s\r\n",lotnnn+"@"+fNm+"@"+lNm+"@"+price+"@"+sqFt+"@"+noBeds);
                        } 
                        catch (Exception e) {}
                    }
                }
             
        } catch (IOException e) {
            System.out.println("File Read Error");
        } 
            boolean success = (new File("DataFile.txt")).delete();
            
            try (BufferedReader in = new BufferedReader(new FileReader("DataFile1.txt"))) 
         {
             String str;         
                
                while ((str = in.readLine())!=null) {
                        String[] ar=str.split("@");
                        lotnnn= ar[0].toString();
                        fNm=ar[1].toString();
                        lNm=ar[2].toString();
                        price = ar[3].toString();
                        sqFt = ar[4].toString();
                        noBeds= ar[5].toString();
                        
                        try(PrintWriter output = new PrintWriter(new FileWriter("DataFile.txt",true))) {
                            output.printf("%s\r\n",lotnnn+"@"+fNm+"@"+lNm+"@"+price+"@"+sqFt+"@"+noBeds);
                        } 
                        catch (Exception e) {}
               }
          
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
                boolean succes = (new File("DataFile1.txt")).delete();

         
             }catch (Exception ex) {
                Logger.getLogger(HouseFile.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }

}
