package pa1;

// Name:Kavish Jadwani
// USC NetID: 6917934471
// CS 455 PA1
// Fall 2017
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.util.Scanner;

/**
 * CoinSimViewer class 
 *  Asks user for total number of Coin Toss trials.If user input is valid,
 * performs the task for required number of times. Otherwise, displays error.
 * Displays the result in the form of bar chart in a graphical window.
 */
public class CoinSimViewer {
/** This is the main class.
 * Gets the desired number of coin toss trials from user. For invalid input, asks user to enter 
 * a new value for desired number of trials. 
 * Displays the result in the form of a bar chart in a graphical window.
 * @param argsC
 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int twoHead = 0;//twoHead indicates the total instances where the output was both heads
        int twoTail = 0;//twoHead indicates the total instances where the output was both tails
        int headTail = 0;//headTail indicates the total instances where the output was a head and a tail
        int totalTrials = -1;// we set the total trials to be -1 initially 
        while (totalTrials < 0) { // this helps us to check whether the use input is valid or not 
            System.out.print("Enter number of trials: ");
            totalTrials = in.nextInt();
            if (totalTrials < 0) {
                System.out.println("ERROR: Number entered must be greater than 0");
            }
        }
        CoinTossSimulator birthday = new CoinTossSimulator();// birthday is an object of type CoinTossSimulator
        birthday.run(totalTrials);
        twoHead = birthday.getTwoHeads();// twoHead holds value returned by CoinTossSimulator 
        twoTail = birthday.getTwoTails();// twoTail holds value returned by CoinTossSimulator 
        headTail = birthday.getHeadTails();//  headTail holds value returned by CoinTossSimulator 
        //twoHeadsPercent holds the percentage of occurence of two heads 
        //twoTailsPercent holds the percentage of occurence of two tails 
        //headTailsPercent hold the percentage of occurence of a head and a tail
        int twoHeadsPercent = (int) Math.round((((double)twoHead * 100) / (double)(totalTrials)));//converting values to percent 
      int twoTailsPercent = (int) Math.round((((double)twoTail * 100) / (double)(totalTrials)));//converting values to percent 
        int headTailsPercent = (int)Math.round( (((double)headTail * 100) / (double)(totalTrials)));//converting values to percent 
        JFrame frame = new JFrame();// constructs a frame
        int WIDTH_OF_FRAME = 800; 
        int HEIGHT_OF_FRAME = 500;
        frame.setSize(WIDTH_OF_FRAME,HEIGHT_OF_FRAME);// specifies the dimensions of the frame
        frame.setTitle("Coin Sim");//Sets the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// causes the code to end if the window is closed
        CoinSimComponent component = new CoinSimComponent(twoHeadsPercent, headTailsPercent, twoTailsPercent,twoHead,headTail,twoTail);
        frame.add(component);// adds the component to the frame 
        frame.setVisible(true);// makes the frame visible
    }
}
