package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Sum sum = new Sum();
        sum.output();

        System.out.println("\n");
        Substraction substraction = new Substraction();
        substraction.output();

        System.out.println("\n");
        Multiplication multiplication = new Multiplication();
        multiplication.output();

        System.out.println("\n");
        Division division = new Division();
        division.output();
    }



}
