//Teagan Peabody
//AT Java
//Hw AO1

package animate;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Board extends JPanel {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private final int SIDE_LEN = 150;

    /*
     * Constructor.
     */
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

    public void paintComponent(Graphics g) {
        // Call parent implementation to clear/draw background first.
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int x_t = B_WIDTH / 2;
        int y_t = B_HEIGHT / 2;
        x_t = x_t - SIDE_LEN / 2;
        y_t = y_t - SIDE_LEN / 2;

        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t, y_t);
        affineTransform.rotate(-Math.toRadians(22.5), SIDE_LEN / 2.0, SIDE_LEN / 2.0);

        Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
        Shape transformedShape = affineTransform.createTransformedShape(rect);

        g2d.setColor(Color.MAGENTA);
        g2d.fill(transformedShape);

        g2d.setColor(Color.BLUE);
        g2d.drawString("Hello, world!", 115, 330);
    }
}
