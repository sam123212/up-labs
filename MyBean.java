/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.fpmi.educational_practice;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class MyBean extends Canvas {
    private int width, height;
    private Color c;
    
    public int getWidth(){return width;}
    public int getHeight() {return height;}
    public Color getColor() {return c;}
    
    public void setHeight(int newh){
        height = newh;
        repaint();
    }
    public void setWidth(int neww){
        width = neww;
        repaint();
    }
    public void setColor(Color newc){
        c = newc;
        repaint();
    }
    
    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int w = getWidth();
        int h = getHeight();
        Color c = getColor();
        g2.setBackground(new Color(10, 10, 10));
        g2.setColor(c);
        g2.fillRoundRect(40, 40, 40 + w, 40 + h, 15, 20);
        g2.setColor(new Color(215, 200, 0));
        g2.drawRoundRect(40, 40, 40 + w, 40 + h, 15, 20);
    }
}
