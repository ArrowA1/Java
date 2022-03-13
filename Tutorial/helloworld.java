/**
 * First Java Program
 * @version 1.2 13-03-2022 
 * @author ArrowA1 
 */ 

package Tutorial;

// name of main public class shud correspond with the filename
// Java is case-sensitive
public class helloworld
{   //start of a block

    // execution starts from the main method
    // hence a main method is required in the source file of class
    public static void main(String args[])  // main method must be public
    {
        System.out.println("Hello World");  // every statement ends with a semicolon
        /* System.out : object
           println() : function */
        int s = sum(12,18);
        System.out.println(
            "Sum of 12 and 18 is "+s);  // can span multiple lines
    }

    static int sum(int a, int b)
    {
        int s = a + b;
        return s;
    }

}   // end of the block