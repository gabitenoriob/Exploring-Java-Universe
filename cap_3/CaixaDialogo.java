package cap_3;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane; 

public class CaixaDialogo
{
   public static void main(String[] args)
   {
      // display a dialog with a message 
      JOptionPane.showMessageDialog(null, "Welcome to Java");

      // prompt user to enter name
      String name = JOptionPane.showInputDialog("What is your name?");
      
      // create the message
      String message =                                              
         String.format("Welcome, %s, to Java Programming!", name);

      // display the message to welcome the user by name 
      JOptionPane.showMessageDialog(null, message);

      String ageString = JOptionPane.showInputDialog("Qual sua idade?");
      int age = Integer.parseInt(ageString);

      String messageAge = String.format("Sua idade é : %d%n", age);
      JOptionPane.showMessageDialog(null, messageAge);

   
   } 
} // end class Dialog1