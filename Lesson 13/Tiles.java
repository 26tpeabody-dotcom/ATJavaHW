//Teagan Peabody
//AT Java HW
//Lesson 13

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Tiles extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int tileSize = 100;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.RED);
                }
                g.fillRect(col * tileSize, row * tileSize, tileSize, tileSize);
            }
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Tiles tiles = new Tiles();
        
        frame.add(tiles);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}