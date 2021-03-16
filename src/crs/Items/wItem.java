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
public class wItem extends Item{
   
    protected double weight;
    
    @Override
    public void setQW(double w)
     {
         this.weight=w;
     }
    
    @Override
    public double calculatePrice()
    {
        this.totalPrice = weight*price;
        return this.totalPrice;
    }

    @Override
    public double getQW() {
       return weight;
    }
    
}

