//Teagan Peabody
//AT Java HW
//Lesson 13

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Face extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);
        
        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 20, 20); // Left eye
        g.fillOval(190, 100, 20, 20); // Right eye
        
        // Draw mouth
        g.drawLine(100, 180, 200, 180); 
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Face face = new Face();
        
        frame.add(face);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}