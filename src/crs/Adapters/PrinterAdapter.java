/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs.Adapters;

import Testing.ReceiptPrinterTest;
import crs.Bill;
import crs.Boundary.ReceiptPrinterInterface;

/**
 *
 * @author abdal
 */
public class PrinterAdapter implements ReceiptPrinterInterface{
    ReceiptPrinterTest rpt = new ReceiptPrinterTest();

    @Override
    public void printBill(Bill b) {
        rpt.printBill(b);
    }
}
