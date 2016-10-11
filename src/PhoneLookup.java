import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that composes a searchable phone directory
 * @author softskeleton
 *
 */
public class PhoneLookup
{
	   
   public static void main(String[] args) throws IOException
   {
      LookupTable lookUp = new LookupTable();
      
  	  Scanner in2 = new Scanner(System.in);
      boolean more = true;
      while (more == true)
      {  
         System.out.println("Lookup N)ame, P)hone number, Q)uit?");
         
         String input = in2.nextLine();
           
         if (input.equalsIgnoreCase("Q")) 
            more = false;
         else if (input.equalsIgnoreCase("N"))
         { 
            System.out.println("Enter name:");
            String n = in2.nextLine();
            System.out.println("Phone number: " + lookUp.lookup(n));
         }
         else if (input.equalsIgnoreCase("P"))
         { 
            System.out.println("Enter phone number:");
            String n = in2.nextLine();
            System.out.println("Name: " + lookUp.reverseLookup(n));
         }
      }
   }
}