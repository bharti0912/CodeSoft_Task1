package internship;

import java.util.Random;
import javax.swing.JOptionPane;


public class NumberGame
{
    public static void main(String[] args) 
    {
        Random random=new Random();
        int randomnu=random.nextInt(100)+1;
        int attempts=3;
        String inputString;
        int userGuess;
        while(attempts!=0)
        {
            inputString= JOptionPane.showInputDialog("Guess the number between 1 t0 100");
            userGuess= Integer.parseInt(inputString);
            
            if(userGuess == randomnu)
            {
                JOptionPane.showMessageDialog(null, "Congratulations ! you guess the correct number");
                break;
            }
            else if(userGuess> randomnu)
            {
                JOptionPane.showMessageDialog(null, "You Guess too High Number..! Guess Again");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "You Guess too Low Number..! Guess Again");
            }
            JOptionPane.showMessageDialog(null, "You have only " + (attempts-1)+ "attempts...");
            attempts--;
        }
        JOptionPane.showMessageDialog(null, "Ohhh! Game Over! Please Try Again.....");
        System.exit(0);
    }
}
