
package pa1;

// Name:Kavish Jadwani
// USC NetID:6917934471
// CS 455 PA1
// Fall 2017
/**
 * class CoinTossSimulatorTester
 * Tests functionality of CoinTossSimulator class by implementing
 * all the methods of CoinTossSimulatorClass
 */
public class CoinTossSimulatorTester {
    /**
     * The program tests the working of all the methods of CoinTossSimulator class 
     * by calling all the methods of that class and outputs the results 
     * @param args
     */
    public static void main(String[] args) {
        
        CoinTossSimulator birthday = new CoinTossSimulator();//declaring an object of type CoinTossSimulator
        System.out.println("After constructor:");
        System.out.print("Number of Trials [exp:0]: ");
       System.out.println(birthday.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(birthday.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(birthday.getTwoTails());
        System.out.print("One-head and one-tail tosses: ");
       System.out.println(birthday.getHeadTails());
        System.out.print("Tosses add up correctly? ");
        System.out.println(birthday.getNumTrials()==(birthday.getTwoHeads()+birthday.getTwoTails()+birthday.getHeadTails()));
        birthday.run(1);
        System.out.println("");
        System.out.println("After run(1)");
        System.out.print("Number of Trials [exp:1]: ");
       System.out.println(birthday.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(birthday.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(birthday.getTwoTails());
        System.out.print("One-head and one-tail tosses: ");
       System.out.println(birthday.getHeadTails());
        System.out.print("Tosses add up correctly? ");
        System.out.println(birthday.getNumTrials()==(birthday.getTwoHeads()+birthday.getTwoTails()+birthday.getHeadTails()));
         birthday.run(10);
        System.out.println("");
        System.out.println("After run(10)");
        System.out.print("Number of Trials [exp:11]: ");
       System.out.println(birthday.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(birthday.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(birthday.getTwoTails());
        System.out.print("One-head and one-tail tosses: ");
       System.out.println(birthday.getHeadTails());
        System.out.print("Tosses add up correctly? ");
        System.out.println(birthday.getNumTrials()==(birthday.getTwoHeads()+birthday.getTwoTails()+birthday.getHeadTails()));
         birthday.run(100);
        System.out.println("");
        System.out.println("After run(100)");
        System.out.print("Number of Trials [exp:11]: ");
       System.out.println(birthday.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(birthday.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(birthday.getTwoTails());
        System.out.print("One-head and one-tail tosses: ");
       System.out.println(birthday.getHeadTails());
        System.out.print("Tosses add up correctly? ");
        System.out.println(birthday.getNumTrials()==(birthday.getTwoHeads()+birthday.getTwoTails()+birthday.getHeadTails()));
        System.out.println("");
        System.out.println("After reset");
        birthday.reset();
         System.out.print("Number of Trials [exp:0]: ");
       System.out.println(birthday.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(birthday.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(birthday.getTwoTails());
        System.out.print("One-head and one-tail tosses: ");
       System.out.println(birthday.getHeadTails());
        System.out.print("Tosses add up correctly? ");
        System.out.println(birthday.getNumTrials()==(birthday.getTwoHeads()+birthday.getTwoTails()+birthday.getHeadTails()));
        birthday.run(1000);
        System.out.println("");
        System.out.println("After run(1000)");
        System.out.print("Number of Trials [exp:1000]: ");
       System.out.println(birthday.getNumTrials());
        System.out.print("Two-head tosses: ");
        System.out.println(birthday.getTwoHeads());
        System.out.print("Two-tail tosses: ");
        System.out.println(birthday.getTwoTails());
        System.out.print("One-head and one-tail tosses: ");
       System.out.println(birthday.getHeadTails());
        System.out.print("Tosses add up correctly? ");
        System.out.println(birthday.getNumTrials()==(birthday.getTwoHeads()+birthday.getTwoTails()+birthday.getHeadTails()));
    }
}
