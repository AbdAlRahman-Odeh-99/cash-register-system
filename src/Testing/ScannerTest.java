/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;
import crs.Boundary.ScannerInterface;
import crs.MainForm;
import java.util.Scanner;
/**
 *
 * @author abdal
 */
public class ScannerTest implements ScannerInterface{

    
    @Override
    public void inputId(int id) {

        MainForm.cor.setQItemId(id);
        
    }


 }

  
    

