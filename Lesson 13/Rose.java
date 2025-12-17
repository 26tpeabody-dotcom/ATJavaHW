//Teagan Peabody
//AT Java HW
//Lesson 13

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Rose extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
        setBackground(Color.PINK);
        g.setColor(new Color(128, 0, 128)); 
        int width = getWidth();
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        int steps = 1000;
        double maxRadius = Math.min(centerX, centerY) * 0.9;
        for (int i = 0; i < steps; i++) {
            double theta = 2 * Math.PI * i / steps;
            double r = Math.cos(2 * theta);
            int x = centerX + (int) (r * Math.cos(theta) * maxRadius);
            int y = centerY - (int) (r * Math.sin(theta) * maxRadius);
            g.drawLine(x, y, x, y);
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Rose rose = new Rose();        
        frame.add(rose);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}