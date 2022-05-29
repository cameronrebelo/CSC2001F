/**
@author Cameron Rebelo RBLCAM001
Main class for the student BST. Accepts student number arguments from the terminal and will then display corresponding student name. No parameters will result in whole tree being displayed.
*/
class AccessBSTApp
{
/**
@param any input from the terminal
main method of the AccessBSTApp
*/
    public static void main ( String [] args)
    {
         Helper h = new Helper();
         if(args.length==0)
         {
                h.printAllStudentsBST(); 
         }
         else
         {
                System.out.println(h.printStudentBST(args[0]));
         }
    }

}