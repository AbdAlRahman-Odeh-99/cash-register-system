/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs;

import java.util.ArrayList;

/**
 *
 * @author abdal
 */
public abstract class Data {
    
    ArrayList<Item> items;
    public Data()
    {
        ArrayList<Item> items = new ArrayList<Item>();
    }
    
    public abstract void setItemInfo();
    
    public Item getItemInfo(int id)
    {
        for(int i=0;i<items.size();i++)
        {
            
            if(items.get(i).itemId == id)
            
                return items.get(i);       
        }
       return null;
    }
}
