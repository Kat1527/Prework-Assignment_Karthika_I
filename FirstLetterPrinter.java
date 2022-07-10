// Java program to find the string which
// contain the first character of each word 
// of another string.
 

import java.util.Scanner;
class FirstLetterPrinter{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String input = in.nextLine();
	System.out.println(firstLetterPrinter(input));
   	}   

	 
    // Function to find string which has first
    // character of each word.
    
public static String firstLetterPrinter(String str)
{
        String result = "";
 
        // Traverse the string
        boolean v = true;
        for (int i = 0; i < str.length(); i++)
        {
            // If it is space, set v as true
            
	    if (str.charAt(i) == ' ')
            {
                v = true;
            }
             
            // Else check if v is true or not.
            // If true, copy character in output
            // string and set v as false
            
	    else if (str.charAt(i) != ' ' && v == true)
            {
                result += (str.charAt(i));
                v = false;
            }
        }
 
        return result;
  }
 }