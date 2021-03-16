/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crs.Adapters;

import Testing.DrawerTest;
import crs.Boundary.DrawerInterface;

/**
 *
 * @author abdal
 */
public class DrawerAdapter implements DrawerInterface{
    DrawerTest dt = new DrawerTest();

    @Override
    public void openDrawer() {
       dt.openDrawer();
    }
    
    
}
