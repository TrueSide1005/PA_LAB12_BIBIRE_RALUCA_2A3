/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author School
 */
public class ControlPanel extends JPanel{
    public JTextField text = new JTextField();
    public JButton b = new JButton("Draw");
    final MainFrame frame;
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        this.add(text);
        this.add(b);
        this.b.addActionListener((ActionEvent acb) -> {
            try {
                frame.designPanel.draw();
            } catch (ClassNotFoundException ex) {
                System.out.println(1 + " " + ex);
            } catch (NoSuchMethodException ex) {
                System.out.println(2 + " " + ex);
            } catch (InstantiationException ex) {
                System.out.println(3 + " " + ex);
            } catch (IllegalAccessException ex) {
                System.out.println(4 + " " + ex);
            } catch (IllegalArgumentException ex) {
                System.out.println(5 + " " + ex);
            } catch (InvocationTargetException ex) {
                System.out.println(6 + " " + ex);
            }
            repaint();
        });
        setLayout(new GridLayout(1, 4));    
    }
}
