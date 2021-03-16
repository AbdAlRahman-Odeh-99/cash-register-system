/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs;

/**
 *
 * @author abdal
 */
public abstract class Item {
    
    protected String name;
    protected int itemId;
    protected double price;
    protected double totalPrice;
    
    public void setItemId(int i)
    {
        this.itemId=i;
    }
     public void setItemInfo(Item i)
    {
        if(i!=null){
        this.itemId=i.itemId;
        this.name=i.name;
        this.price=i.price;
        }
        else
            System.out.println("Item not found in the Stored Items");
    }
      public void setItemInfo(int id,String name,double price)
      {
          this.itemId=id;
          this.name=name;
          this.price=price;
      }
    public abstract double calculatePrice();
    public abstract double getQW();
    public abstract void setQW(double w);
}
