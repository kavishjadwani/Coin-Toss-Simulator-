package pa1;
// Name:Kavish Jadwani
// USC NetID: 6917934471
// CS 455 PA1
// Fall 2017
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import pa1.Bar;
import java.awt.Rectangle;
/**
 * CoinSimComponent class 
 * This component draws three bars
 */
public class CoinSimComponent extends JComponent {
    int bar1Height;
    int bar2Height;
    int bar3Height;
    int numberTwoHead;
    int numberHeadTail;
    int numberTwoTail;
    public CoinSimComponent(int height1, int height2, int height3,int twoHead,int headTail ,int twoTail) {
        this.bar1Height = height1;
        this.bar2Height = height2;
        this.bar3Height = height3;
        this.numberTwoHead = twoHead;
        this.numberHeadTail = headTail;
        this.numberTwoTail = twoTail;
    }
/**Modify the JComponent class's paintComponents method and 
 * specifies how to component should be painted
 * @param g graphic object, stores the graphic state
 */
    public void paintComponent(Graphics g) {
        //Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        int canvasWidth = getWidth();
        int canvasHeight = getHeight();
        System.out.println("The height of canvas is :" + canvasHeight);
        int height1 = bar1Height * ((int) ((canvasHeight - 100) / 100) + 1);// defines the height of bar1 scaled to the size of the graphical window
        int height2 = bar2Height * ((int) ((canvasHeight - 100) / 100) + 1);// defines the height of bar1 scaled to the size of the graphical window
        int height3 = bar3Height * ((int) ((canvasHeight - 100) / 100) + 1);// defines the height of bar1 scaled to the size of the graphical window
        int MARGIN = 50;
        int bottom1 = canvasHeight - MARGIN;//defines the bottom of the bar1 
        int bottom2 = canvasHeight  - MARGIN;//defines the bottom of bar2 
        int bottom3 = canvasHeight - MARGIN;//defines the bottom of bar3 
        int n = (int) (canvasWidth / 5);
        int x1 = n;//defines the x co-ordinate for bar 1
        int x2 = x1 + 50 + n;// defines the x co-0rdinate for bar2 
        int x3 = x2 + 50 + n;// defines the x co-ordinate for bar3
        Bar bar1 = new Bar(bottom1, x1, 50, height1, 5, Color.red, "Two Heads: "+ numberTwoHead + "(" + bar1Height +")%");
        Bar bar2 = new Bar(bottom2, x2, 50, height2, 5, Color.orange, "A Head and A Tail: "+ numberHeadTail + "(" + bar2Height +")%");
        Bar bar3 = new Bar(bottom3, x3, 50, height3, 5, Color.blue, "Two Tails: "+ numberTwoTail + "(" + bar3Height +")%");
        //if (height1 > 0)
            bar1.draw(g2);// draws bar1
        
        //if (height2 > 0)
            bar2.draw(g2);// draws bar2
        //if (height3 > 0)
            bar3.draw(g2);// draws bar2 
    }
}
