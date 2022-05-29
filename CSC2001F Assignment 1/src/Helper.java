/**
@author Cameron Rebelo RBLCAM001
Helper class designed to create encapsulation for functions performed on the student array and BST. Methods here are used by other classes to perform functions on the data stored in the array and BST.
*/
public class Helper
{
    private StudentArray sArray = new StudentArray();
    private BinarySearchTree<Student> sBST = (new StudentBinarySearchTree()).getBST();
    public Helper()
    {
    }
/**
@param studentNumber to search for
Method to search for corresponding Student object in array based on a given student number
@return String with student name matching to student number
*/    
    public String printStudent(String studentNumber)
    {
        Student[] studentSearch = sArray.getArray();
        int opCount=0;
        for (int i=0; i<studentSearch.length; i++)
        {
            opCount++;
            if(studentNumber.compareTo(studentSearch[i].getStudentNumber())==0)
            {
                System.out.println(opCount+" comparisons");
                return studentSearch[opCount].getName();
            }
        }
        System.out.println(opCount+" comparisons");
        return "Access denied!";
    }
/**
method to print out details of all the students in the array
@return String containing details of all students in array
*/    
    public String printAllStudents()
    {
        String print ="";
        Student [] printArray = sArray.getArray();
        for(int i=0;i<(printArray.length);i++)
        {
            print+=(printArray[i].toString())+"\n";
        }
        return print;
    }
/**
@param studentNumber to search BST for
method to search for matching student object in BST to a given student number
@return String containing name of student matching to he given student number
*/    
    public String printStudentBST(String studentNumber)
    {
        try
        {
            if((sBST.find(new Student(studentNumber, null)))!=null)
            {
                return (sBST.find(new Student(studentNumber, null))).data.getName();            
            }
            else
            {
                return "Access denied!";
            }
        }
        catch(NullPointerException Ne)
        {
            return "Access denied!";
        }
    }
/**
method to invoke BST function to print out details of all students in the BST
*/    
    public void printAllStudentsBST()
    {
        sBST.inOrder();    
    }    
}