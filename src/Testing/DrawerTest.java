/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import crs.Boundary.DrawerInterface;

/**
 *
 * @author abdal
 */
public class DrawerTest implements DrawerInterface{
      @Override
    public void openDrawer() {
        System.out.println("Drawer Opened !!!");
    }
}
