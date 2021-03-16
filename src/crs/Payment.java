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
public class Payment {
    private double total;
    private double customerPay;
    private double customerChange;
    
    public Payment()
    {
        this.total=0;
        this.customerChange=0;
        this.customerPay=0;
    }
    public void updateTotal(double p)
    {
        total+=Double.parseDouble(String.format("%.3f",p));
    }
    public double getTotal()
    {
        return Double.parseDouble(String.format("%.3f",total));
    }
    public void setCustomerPay(double cp)
    {
        this.customerPay=cp;
    }
    public void calculateChange()
    {
        if(customerPay>total)
        customerChange=Double.parseDouble(String.format("%.3f",customerPay-total));
        else
        customerChange=0;
    }
    public double getCustomerPay()
    {
        return this.customerPay;
    }
    public double getChange()
    {
        calculateChange();
        return customerChange;
    }
    
}
