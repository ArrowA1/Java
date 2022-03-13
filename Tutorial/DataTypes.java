/**
 * Java Program to illustrate datatypes
 * @version 1.2 13-03-2022 
 * @author ArrowA1 
 */

 package Tutorial;

 public class DataTypes
 {
     public static void main(String[] args)
     {
        integer_types();
        floating_types();
     }

     // method to demonstrate integer data types
     private static void integer_types()
     {
        System.out.println("\nIntegers Datatypes:");
        System.out.println("Type\tStorage");

        System.out.println("int\t4 bytes");
        int num = 1_00_000; // allowed; compiler ignores underscores
        
        System.out.println("short\t2 bytes");

        System.out.println("long\t8 bytes");
        // use suffix 'l' or 'L' for long

        System.out.println("byte\t1 byte");
     }

     // method to demonstrate floating-point data types
     private static void floating_types()
     {
        System.out.println("\nFloating-Point Datatypes:");
        System.out.println("Type\tStorage");

        System.out.println("float\t4 bytes");
        // use suffix 'f' or 'F' for float
        
        System.out.println("double\t8 bytes");
        // use suffix 'd' or 'D' for double
        // default is double
     }
 }