package pa1;
// Name:Kavish Jadwani
// USC NetID:6917934471
// CS 455 PA1
// Fall 2017

/**
 * class CoinTossSimulator
 *
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 *
 * NOTE: we have provided the public interface for this class. Do not change the
 * public interface. You can add private instance variables, constants, and
 * private methods to the class. You will also be completing the implementation
 * of the methods given.
 *
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 *
 */
import java.util.Random;

public class CoinTossSimulator {

    private int completedTrials = 0;
    private int countHeads = 0;
    private int countTails = 0;
    private int countHeadTails = 0;
    private int totalTrialsRemaining = 0;
    public Random in = new Random();

    /**
     * Creates a coin toss simulator with no trials done yet.
     */
    public CoinTossSimulator() {
        completedTrials = 0;
        countHeads = 0;
        countTails = 0;
        countHeadTails = 0;
    }

    /**
     * Runs the simulation for numTrials more trials. Multiple calls to this
     * method without a reset() between them *add* these trials to the current
     * simulation.
     *
     * @param numTrials number of trials to for simulation; must be >= 1
     */
    public void run(int numTrials) {
        totalTrialsRemaining = totalTrialsRemaining + numTrials;
        while (totalTrialsRemaining > 0) {
            int n = in.nextInt(3);
            if (n == 0) {
                countHeads++;
            } else if (n == 1) {
                countTails++;
            } else if (n == 2) {
                countHeadTails++;
            }
            totalTrialsRemaining--;
            completedTrials++;
        }
    }

    /**
     * Get number of trials performed since last reset.
     */
    public int getNumTrials() {
        return completedTrials;
    }

    /**
     * Get number of trials that came up two heads since last reset.
     */
    public int getTwoHeads() {
        return countHeads;
    }

    /**
     * Get number of trials that came up two tails since last reset.
     */
    public int getTwoTails() {
        return countTails;
    }

    /**
     * Get number of trials that came up one head and one tail since last reset.
     */
    public int getHeadTails() {
        return countHeadTails;
    }

    /**
     * Resets the simulation, so that subsequent runs start from 0 trials done.
     */
    public void reset() {
        totalTrialsRemaining = 0;
        completedTrials = 0;
        countHeads = 0;
        countTails = 0;
        countHeadTails = 0;

    }
}
