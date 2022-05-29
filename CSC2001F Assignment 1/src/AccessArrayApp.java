/**
@author Cameron Rebelo RBLCAM001
main class for the AccessArrayApp. Accepts arguements from the terminal to search for specific students from their student number and will then return their name. No parameters will display all students details in the array.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class AccessArrayApp
{
/**
@param any input from the terminal
main method of the AccessArrayApp
*/
        public static void main ( String [] args)
        {
                Helper h = new Helper();
                if(args.length==0)
                {
                        System.out.println(h.printAllStudents()); 
                }
                else
                {
                        System.out.println(h.printStudent(args[0]));
                }   
        }

}