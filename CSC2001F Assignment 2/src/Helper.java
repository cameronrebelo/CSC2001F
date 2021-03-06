/**
@author Cameron Rebelo RBLCAM001
Helper class designed to create encapsulation for functions performed on the AVL tree. Methods here are used by other classes to perform functions on the data stored in the AVL tree.
*/
public class Helper
{
    private AVLTree<Student> sAVL = (new StudentAVL()).getAVL();
/**
default contructor for helper class
*/
    public Helper()
    {
    }
/**
@param studentNumber of student that user is looking for
method to search for matching student object in AVL to a given student number
@return String containing name of student matching to the given student number
*/    
    public String printStudentAVL(String studentNumber)
    {
        try
        {
            if((sAVL.find(new Student(studentNumber, null)))!=null)
            {
                return (sAVL.find(new Student(studentNumber, null))).data.getName();            
            }
            else
            {
                return "Access denied!";
            }
        }
        catch(NullPointerException Ne)
        {
            return "Access denied! "+Ne;
        }
    }
/**
method to invoke AVL function to print out details of all students in the AVL
*/    
    public void printAllStudentsAVL()
    {
        sAVL.treeOrder();    
    }    
}