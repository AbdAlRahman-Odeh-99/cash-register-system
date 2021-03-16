/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs.Adapters;

import Testing.ScannerTest;
import crs.Boundary.ScannerInterface;

/**
 *
 * @author abdal
 */
public class ScannerAdapter implements ScannerInterface{
    ScannerTest st = new ScannerTest();    
    @Override
    public void inputId(int id) {
        st.inputId(id);
      
        }
}
