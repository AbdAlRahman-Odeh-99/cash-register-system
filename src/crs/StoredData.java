/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs;
import crs.Items.wItem;
import crs.Items.qItem;
import java.io.*;
//import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author abdal
 */
public class StoredData extends Data{

    public StoredData()
    {
        items = new ArrayList<Item>();
    }
    @Override
    public void setItemInfo() {
        
         BufferedReader br = null;
         String line;
        try {
              br = new BufferedReader(new FileReader("products.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't find file !");
            System.exit(0);
        }
        try{
            
        while((line=br.readLine()) != null)
        {

            Item item=null;
            String[] s=line.split(" ");
            int priceIndex=line.indexOf("Price:");
            String subStr=line.substring(priceIndex+7);
            int id=0;
            String name = "";
            double price=Double.parseDouble(subStr);
            
            for(int i=0;i<s.length;i++)
            {
                if(s[i].equals("Name:"))
                    name=s[i+1];
                else if(s[i].equals("Number:"))
                    id=Integer.parseInt(s[i+1]);   
                else if(s[i].equals("Count:"))
                    item=new qItem();
                else if(s[i].equals("Weight:"))
                    item=new wItem();
            }
            item.setItemInfo(id, name, price); item.setQW(1);
            items.add(item);
         
        }
            
        }
            
        catch(Exception ex)
        {
            System.out.println("Error !");
            System.exit(0);
        }
    }
    
}
