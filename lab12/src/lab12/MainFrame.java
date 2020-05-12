/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author School
 */
public final class MainFrame extends JFrame{
    public DesignPanel designPanel=new DesignPanel(this);
    public ControlPanel controlPanel=new ControlPanel(this);
    
    public MainFrame() {
        init();
    }
    
    public void init() {
        add(controlPanel, BorderLayout.NORTH);
        add(designPanel, BorderLayout.CENTER);        
        pack();
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        new MainFrame().setVisible(true);
    }
    
}
