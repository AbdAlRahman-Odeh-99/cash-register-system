/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;


import crs.Bill;
import crs.Boundary.ReceiptPrinterInterface;

/**
 *
 * @author abdal
 */
public class ReceiptPrinterTest implements ReceiptPrinterInterface {

    public ReceiptPrinterTest() {
        System.out.println("Printing Bill !!!");
    }

    
    @Override
    public void printBill(Bill b) {
  
        String s=b.printBill();
        System.out.println(s);
        System.out.println("Bill Printed !!!");
    }

    
    
}
