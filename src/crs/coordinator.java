/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs;

import crs.Items.wItem;
import crs.Items.qItem;
import static crs.TransactionForm.addRows;

/**
 *
 * @author abdal
 */

public class coordinator {
    
    protected StoredData db ;
    protected Bill b ;
    protected Item iq;
    protected Item iw;
  
    
    public coordinator()
    {
         db = new StoredData();

    }
    
    public void startBill()
    {
         LogEvent.getInstance().addLog("A New Bill Is Created !\n");
         b = new Bill();
    }
    
    // Adding Scanned item
    //--------------------------------------------------------------------------
    public void setQItemId(int id)
    {
       iq = new qItem();
       iq= db.getItemInfo(id);
    }
    public void setQuantity(double q)
    {
        if(iq!=null)
        iq.setQW(q);
    }
    public void addQItem()
    {
        if(iq!=null){
        b.addItem(iq);
        addRows(iq);
        }
        else{
            System.out.println("Item not found in the Stored Items");
        }
    }
    //--------------------------------------------------------------------------
    
    // Adding weighted item
    //--------------------------------------------------------------------------
    public void setWItemId(int id)
    {
       iw = new wItem();
       iw= db.getItemInfo(id);     
    } 
    public void setWeight(double w)
    {
        if(iw!=null)
        iw.setQW(w);
    }
    public void addWItem()
    {
        if(iw!=null){
        b.addItem(iw);
        addRows(iw);
        }
        else{
            System.out.println("Item not found in the Stored Items");
        }
    }
    //--------------------------------------------------------------------------
    
    public void setCustomerPay(double cp)
    {
        b.paymentInfo.setCustomerPay(cp);
    }
    
   public void  removeItem(int id)
   {
       b.removeItem(id);
   }
   
}
