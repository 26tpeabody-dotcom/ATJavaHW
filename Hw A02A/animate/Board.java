//Teagan Peabody
//AT Java
//Hw AO2A

package animate;

import java.io.File;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;
    private BufferedImage img;

    /*
     * Constructor.
     */
    public Board() {
        // Use a fixed content area for assignment transforms.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        try {
            File imageFile = new File("media/IMG_5258.jpeg");
            img = ImageIO.read(imageFile);
        } catch (IOException e) {
            img = null;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // Call parent implementation to clear/draw background first.
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        if (img != null) {
            int contentWidth = getWidth();
            int contentHeight = getHeight();

            // Quarter area means half width and half height.
            int drawWidth = contentWidth / 2;
            int drawHeight = contentHeight / 2;

            int tx = contentWidth - drawWidth;
            int ty = contentHeight - drawHeight;

            double sx = drawWidth / (double) img.getWidth();
            double sy = drawHeight / (double) img.getHeight();

            AffineTransform transform = new AffineTransform();
            transform.translate(tx, ty);
            transform.scale(sx, sy);

            g2d.drawImage(img, transform, this);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}
