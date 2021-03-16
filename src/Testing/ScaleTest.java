/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;
import java.util.Scanner;
import crs.Boundary.ScaleInterface;
import crs.MainForm;

/**
 *
 * @author abdal
 */
public class ScaleTest implements ScaleInterface{
    
 
    double weight;
    
    @Override
    public void inputWeight(double w) {
         //this.weight=w;
         MainForm.cor.setWeight(w);
    }
    
    public double getWeight() {
     //return this.weight;
     return 0;
    }
    
}
    
