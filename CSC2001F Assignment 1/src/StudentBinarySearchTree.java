/**
@author Cameron Rebelo RBLCAM001
StudentBinarySearchTree is used to populate the Binary Search Tree data structure with data from the oklist.txt file stored in the form of Student objects in the nodes. Also includes a method that returns the Binary Search Tree so the data can be manipulated elsewhere. 
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentBinarySearchTree
{
    private BinarySearchTree<Student> sBST = new BinarySearchTree<Student>();
    private int size=0;
/**
constructor for StudentBinarySearchTree that populates a BST with the data from oklist.txt
*/    
    public StudentBinarySearchTree()
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
                sBST.insert(new Student(studentNumber, name));
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
method to retrieve BST with students data
@return a BST with all students data in it
*/    
    public BinarySearchTree<Student> getBST()
    {
        return sBST;
    }    
}