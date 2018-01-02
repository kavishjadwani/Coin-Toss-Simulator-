package pa1;

// Name:Kavish Jadwani
// USC NetID: 6917934471
// CS 455 PA1
// Fall 2017
// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class A labeled bar that can serve as a single bar in a bar graph. The
 * text for the label is centered under the bar.
 *
 * NOTE: we have provided the public interface for this class. Do not change the
 * public interface. You can add private instance variables, constants, and
 * private methods to the class. You will also be completing the implementation
 * of the methods given.
 *
 */
public class Bar {

    /**
     * Creates a labeled bar. You give the height of the bar in application
     * units (e.g., population of a particular state), and then a scale for how
     * tall to display it on the screen (parameter scale).
     *
     *
     * @param bottom location of the bottom of the label
     * @param left location of the left side of the bar
     * @param width width of the bar (in pixels)
     * @param barHeight height of the bar in application units
     * @param scale how many pixels per application unit
     * @param color the color of the bar
     * @param label the label at the bottom of the bar
     */
    int bottom;
    int left;
    int width;
    int barHeight;
    double scale;
    Color color;
    String label = "";

    public Bar(int bottom, int left, int width, int barHeight,
            double scale, Color color, String label) {
        this.bottom = bottom;
        this.left = left;
        this.width = width;
        this.barHeight = barHeight;
        this.scale = scale;
        this.color = color;
        this.label = label;
    }

    /**
     * Draw the labeled bar.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        String label = this.label; // label is set to the label of the bar on which the method is called.
        Font font = g2.getFont();
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D labelBounds = font.getStringBounds(label, context);
        int widthOfLabel = (int) labelBounds.getWidth();
        int heightOfLabel = (int) labelBounds.getHeight();
        Rectangle bar1 = new Rectangle(left, (bottom - barHeight), width, barHeight);// creates the bar 
        if (barHeight > 0) {//the if statement is used to display the bar only if the bar has a certain height 
            g2.setColor(color);
            g2.fill(bar1);
            g2.draw(bar1);
        }
        g2.setColor(Color.BLACK);
        g2.drawString(label, left-37, bottom + 15);

    }
}
