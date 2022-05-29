/**
@author Cameron Rebelo RBLCAM001
StudentAVL populates a AVL Tree data structure with data from the oklist.txt file stored in the form of Student objects in the nodes. Also includes a method that returns the Binary Search Tree so the data can be manipulated elsewhere. 
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentAVL
{
    private AVLTree<Student> sAVL = new AVLTree<Student>();
    private int size=0;
/**
constructor for StudentAVL that populates a AVL with the data from oklist.txt
*/    
    public StudentAVL()
    {
        try
        {
            Scanner file = new Scanner(new File("../data/oklist.txt"));
            while(file.hasNext())
            {
                String line = file.nextLine();
                Scanner scLine = new Scanner(line);
                String studentNumber = scLine.next();
                String fName = scLine.next();
                String lName = scLine.next();
                String name = fName+" " + lName;
                sAVL.insert(new Student(studentNumber, name));
                size++;
                scLine.close();
            }       
            file.close();
        }
        catch(FileNotFoundException Fe)
        {
            System.out.println("Error: "+Fe);
        }        
    }
/**
method to retrieve an AVL Tree with students data
@return a AVL Tree with all students data in it
*/    
    public AVLTree<Student> getAVL()
    {
        return sAVL;
    }    
}