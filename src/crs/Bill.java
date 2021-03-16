/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdal
 */
public class Bill {
    
    private String storeName;
    private String date;
    private String time;
    protected ArrayList<Item> productList;
    protected Payment paymentInfo ;
    
    public Bill()
    {
        this.storeName ="JUST Cash Register";
        
        Calendar cal = Calendar.getInstance();
        Date d=cal.getTime();
        Format dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        this.date = dateFormat.format(d);
        this.time = timeFormat.format(d);
        productList = new ArrayList<Item>();
        paymentInfo = new Payment();
        
    }
    
    public Bill getBill()
    {
        return this;
    }
    
    public void addItem(Item i)
    {
        
        if(i != null){
            
        i.price =Double.parseDouble(String.format("%.3f",i.price));
        double totalPrice= i.price*i.getQW();
        i.totalPrice=Double.parseDouble(String.format("%.3f",totalPrice));
        productList.add(i);
        paymentInfo.updateTotal(i.totalPrice);
        }
        else
            System.out.println("Item not found in Stored Items");
    }
    
    
    public void removeItem(int id)
    {


        int r=-1;
        for(int i=0;i<productList.size();i++)
        {
            if((productList.get(i)).itemId == id){
                    r=i;
                    break;
            }
        }
        
        if(r!=-1){
         double updateAmmount=-1*productList.get(r).totalPrice;
         paymentInfo.updateTotal(updateAmmount);
         productList.remove(r);
        }else
        {
            System.out.println("Invalid delete.Item not found!");
        }
        
    }
    
    public String printBill()
    {
        System.out.println(date+"   "+time);
        String s="";
        for(int i=0;i<productList.size();i++){
        s+=("Item ID: "+productList.get(i).itemId+"  "+
                           "Item Name: "+productList.get(i).name+"   "+
                           "Item Price: "+productList.get(i).price+"    "+
                           "Item Quantity/Weight: "+productList.get(i).getQW()+"  "+
                           "Total Price: "+productList.get(i).totalPrice+"\n");
        
               }
        s +="Total Price: "+this.paymentInfo.getTotal()+"\n"+
            "Customer Pay: "+this.paymentInfo.getCustomerPay()+"\n"+
            "Change: "+this.paymentInfo.getChange()+"\n---------------------------------------------\n";
       //System.out.println(s);
       //System.out.println("Total Price: "+this.paymentInfo.getTotal());
       //System.out.println("Customer Pay: "+this.paymentInfo.getCustomerPay());
       //System.out.println("Change: "+this.paymentInfo.getChange());
        
       //System.out.println("Total Price: "+this.paymentInfo.getTotal());
       //System.out.println("Customer Pay: "+this.paymentInfo.getCustomerPay());
       //System.out.println("Change: "+this.paymentInfo.getChange());
       return s;
    }

}
