// Teagan Peabody
// AT Java
// AO2B

package partb;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private double x = 0;
    private double y = 0;
    private final int xSpeed = 1;
    private final int ySpeed = 1;
    private double angleDeg = 0;
    private final double ROTATE_SPEED = 5.0; // degrees per interval

    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;

    private BufferedImage image;

    private class ScheduledUpdate extends TimerTask {
        public void run() {
            x += xSpeed;
            y += ySpeed;
            angleDeg += ROTATE_SPEED;

            // Wrap in x direction
            if (x > B_WIDTH) {
                x = 0;
            }
            // Wrap in y direction
            if (y > B_HEIGHT) {
                y = 0;
            }

            repaint();
        }
    }

    /*
     * Constructor
     */
    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // Load the Andy image from the media folder
        try {
            image = ImageIO.read(new File("media/Andy.png"));
        } catch (IOException e) {
            System.err.println("Could not load media/Andy.png: " + e.getMessage());
        }

        // Start at the upper-left corner (center of image at 0,0)
        x = 0;
        y = 0;

        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(),
                INITIAL_DELAY, PERIOD_INTERVAL);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        if (image != null) {
            int imgW = image.getWidth();
            int imgH = image.getHeight();

            // Build transform: translate to (x,y), then rotate about image center
            AffineTransform at = new AffineTransform();
            at.translate(x, y);
            at.rotate(Math.toRadians(angleDeg), imgW / 2.0, imgH / 2.0);
            at.translate(-imgW / 2.0, -imgH / 2.0);

            g2d.drawImage(image, at, this);
        }
    }
}
