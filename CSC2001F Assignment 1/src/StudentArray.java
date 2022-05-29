/**
@author Cameron Rebelo RBLCAM001
Student array is used to populate the array data structure with the data from oklist.txt. Also includes a method to access the whole array to manipulated elsewhere.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentArray
{
        private Student[] s = new Student[5000];
        private int size=0;
/**
constructor of StudentArray that populates an array with the data stored in oklist.txt
*/        
        public StudentArray()
        {
        
                try
                {
                        Scanner file = new Scanner(new File("/home/cameron/Assignment1/data/oklist.txt"));
                        while(file.hasNext())
                        {
                                String line = file.nextLine();
                                Scanner scLine = new Scanner(line);
                                String studentNumber = scLine.next();
                                String fName = scLine.next();
                                String lName = scLine.next();
                                String name = fName+" " + lName;
                                s[size]=new Student(studentNumber, name);
                                size++;
                                scLine.close();
                        }       
                        file.close();
                }
                catch(FileNotFoundException Fe)
                {
                        System.out.println("Error \n"+Fe);
                }
        }
/**
method to retrieve array with all students stored in it
@return array of student objects
*/        
        public Student[] getArray()
        {
                return s;
        }
}
