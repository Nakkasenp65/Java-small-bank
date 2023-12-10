/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JTextField;

/**
 *
 * @author nakka
 */
//public class TextField extends JTextField{
//    public TextField(){
//    setBorder(new EmptyBorder(10,10,10,10));
//    setBackground(new Color(0,0,0,0));
//    setHorizontalAlignment(JTextField.CENTER);
//    }
//    
//        @Override
//        protected void paintComponent(Graphics grphcs) {
//        super.paintComponent(grphcs); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//        Graphics2D g2 = (Graphics2D) grphcs.create();
//        g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); g2.setColor (getBackground());
//        g2.fill(new RoundRectangle2D. Double (0, 0, getWidth(), getHeight(), 10, 10));
//        g2.dispose();
//        super.paintComponent (grphcs);
//        
//    }
//}

public class TextField extends JTextField {
    private Shape shape;
    public TextField() {
        setOpaque(false); // As suggested by @AVD in comment.
    }
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
    
    
}

