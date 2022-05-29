/**
@author Cameron Rebelo RBLCAM001
class that creates an object called student that stores the details of a student in it
*/
class Student implements Comparable<Student>
{
    private String studentNumber;
    private String name;
/**
@param String s = student number of the student
@param String n = name and surname of the student
constructor that creates student object with details s and n
*/    
    public Student(String s, String n)
    {
        this.studentNumber=s;
        this.name=n;
    }
/**
accessor for studentNumber
@return String with studentNumber of Student object
*/    
    public String getStudentNumber()
    {
        return this.studentNumber;
    }
/**
accessor for Name
@return String with name of Student in student object
*/     
    public String getName()
    {
        return this.name;
    }
/**
toString method of student object
@return details of student
*/    
    public String toString()
    {
        return name + " " + studentNumber;    
    }
    
    public int compareTo(Student other)
    {
     return this.studentNumber.compareTo(other.getStudentNumber());   
    }

}