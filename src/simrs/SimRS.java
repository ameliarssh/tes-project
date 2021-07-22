/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simrs;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class SimRS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new frmUtama().setVisible(true);
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        frmUtama utama= new frmUtama();
        utama.setSize(screen.width,screen.height);
        utama.setVisible(true);
        utama.setExtendedState(JFrame.MAXIMIZED_BOTH);
       
       
    }
    
}
