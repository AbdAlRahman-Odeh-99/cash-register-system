/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs.Adapters;

import Testing.ScaleTest;
import crs.Boundary.ScaleInterface;

/**
 *
 * @author abdal
 */
public class ScaleAdapter implements ScaleInterface{
    ScaleTest sct  =new ScaleTest();    
    @Override
    public void inputWeight(double w) {
         sct.inputWeight(w);
    }
}
