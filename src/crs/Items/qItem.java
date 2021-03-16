/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs.Items;

import crs.Item;

/**
 *
 * @author abdal
 */
public class qItem extends Item{
    
     protected int quantity;
     
        
     @Override
    public double calculatePrice()
    {
         this.totalPrice = Double.parseDouble(String.format("%.3f",(quantity*price)));
         return this.totalPrice;
    }

    @Override
    public double getQW() {
       return quantity;
    }

    @Override
    public void setQW(double w) {
        quantity = (int) w;
    }

  
    

}
