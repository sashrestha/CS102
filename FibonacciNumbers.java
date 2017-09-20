// Name: Samana Shrestha
// Course: CS 102
// Assignment 4 PART II
// Date: 28th October 2015
/* CODE DESCRIPTION:
 * FibonacciNumbers is a program that uses array list to display the 
 * Fibonacci sequence for a number entered by the user. 
 * It prompts the user to enter a number and then uses the following 
 * calculation to get the Fibonacci sequence; each element is entered one at
 * a time into an array list:
 * 
 * fib(0) = 0
 * fib(1) = 1
 * fib(n) = fib(n-1) + fib(n-2) for n > 1
 * 
 */

// import statements
import java.util.*;
import javax.swing.*;

public class FibonacciNumbers //class declaration
{
  // static method to calculate and return the sequence
  public static ArrayList<Integer> fiboSeq (int num) 
  {
    // new arraylist to hold the Fibonacci sequence
    ArrayList<Integer> fiboAl = new ArrayList<Integer>();
    
    //for loop to run until index starting at 0 equals num 
    for (int i = 0; i <= num; i++)
    {
      //case 1: when i = 0
      if (i == 0)
      {
        //add 0 to the sequence to be returned
        fiboAl.add (0);
      }
      
      //case 2: when i = 1
      else if (i == 1)
      {
        //add 1 to the sequence to be returned
        fiboAl.add (1);
      }
      
      //else case: when i > 1
      else 
      {
        //add the sum of item at (i-1)th position and (i-2)th position of 
        //the sequence being created
        //this is the same as calling the method recursively on i-1 and
        //i-2 and adding the value added to the sequence during each call
        fiboAl.add (fiboAl.get(i - 1) + fiboAl.get(i - 2));
      }
    } // end of for loop
    
    //return the list containing the fibonacci sequence
    return fiboAl;
    
  } // end of fiboSeq(num)
  
  //main method
  public static void main (String[] args) {
    
    String numStr; //variable to hold number input by user as string
    int num; //variable to hold the number as an integer
    
    //prompting user to input a number for fibonacci sequence
    numStr = JOptionPane.showInputDialog
      ("<html>Welcome to Samana's <b>Fibonacci sequence</b> app!</html>\n"
         + "<html>Enter a <b>positive integer</b> and I will </html>\n"
         + "<html>give you its Fibonacci sequence!:</html>\n");
    
    //parsing the input number from a string to an integer
    num = Integer.parseInt(numStr);
    
    //new arraylist to hold the sequence returned by fiboSeq(num)
    ArrayList<Integer> fSequence = fiboSeq(num);
    
    //dialogbox to print Fibonacci sequence as string concatenated with its size
    JOptionPane.showMessageDialog 
      (null, "The Fibonacci sequence for " 
         + num + " is \n"
         + fSequence.toString() +
       "\nAnd the size of the sequence is " +
       fSequence.size() + "\n\nGoodbye!");
    
    //command to exit the separate interaction window. 
    System.exit(0);
    
  } // end of main method
}// end of class FibonacciNumbers
