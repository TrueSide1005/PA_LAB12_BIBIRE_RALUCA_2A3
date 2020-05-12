/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author School
 */
public class DesignPanel extends JPanel {

    final MainFrame frame;
    int x = 10;
    int y = 10;

    public DesignPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        setPreferredSize(new Dimension(800, 600));
        setLayout(null);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    draw();
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
            }

        });
    }

    public void draw() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println(frame.controlPanel.text.getText());
        Class clazz = Class.forName(frame.controlPanel.text.getText());
        Class[] parameters = new Class[]{String.class};
        Constructor constructor = clazz.getConstructor(parameters);
        Object o = constructor.newInstance(new Object[]{"test"});
        JComponent nume = (JComponent) o;
        Random rand = new Random();
        nume.setBounds(x, y, 150, 20);
        x = x + 100;
        add(nume);
        revalidate();
        repaint();
    }

}
