import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A table for lookups and reverse lookups
 * @author softskeleton
 *
 */
public class LookupTable
{ 
   private String phone;
   private String name;
   private String quit;
   private ArrayList<String> names;
   private ArrayList<String> numbers;
   private ArrayList<String> dir;

   /**
    * Constructs an empty LookupTable
 * @throws FileNotFoundException 
    */
   public LookupTable() throws FileNotFoundException
   { 
	   names = new ArrayList<String>();
	   numbers = new ArrayList<String>();
	   dir = new ArrayList<String>();
      phone= "";
      name="";
      quit="Q";
      File directory = new File("//home//softskeleton//workspace//PhoneLookup//src//Directory");
      Scanner in = new Scanner(directory);
   		while (in.hasNextLine()) {
   			dir.add(in.nextLine());
   		}
   		in.close();
   		
   		for (int i = 0; i < dir.size(); i++) {
   			names.add(dir.get(i));
   			i++;
   		}
   		
   		for(int i = 1; i < dir.size(); i++) {
   			numbers.add(dir.get(i));
   			i++;
   		}
   }
   
   
   /**
    *    Looks up a number in the table.
    *  @param k the key to find
    *  @return found the found number (if it exists)
    */
   public String lookup(String k)
   { 	String found = null;
	   for (int i = 0; i < names.size(); i++) {
		   	if (k.equals(names.get(i))){
			  found = numbers.get(i);
		   	}
	   }
	   return found;
   }

   /**
      Looks up a name in the table.
      @param v the value to find
      @return found the found number (if it exists)
   */
   public String reverseLookup(String v)
   { 
	   String found = null;
	   for (int i = 0; i < numbers.size(); i++) {
		   if (v.equals(numbers.get(i))) {
			  found = names.get(i); 
		   }
      }
	   return found;  
   }
}