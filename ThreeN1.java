// Name: Samana Shrestha
// Course: CS 102
// Assignment 4 PART I
// Date: 28th October 2015
/* CODE DESCRIPTION:
 * ThreeN1 is a program that uses array list to display the 
 * 3N+1 sequence for a number entered by the user. 
 * It prompts the user to enter a number and then uses the following 
 * calculation to get the desired sequence; each element is entered one at
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


public class ThreeN1 //class declaration
{
  // static method to calculate and return the sequence
  public static ArrayList<Integer> three1 (Integer num) {
    
    // new arraylist to hold the 3N+1 sequence
    ArrayList<Integer> seqAl = new ArrayList<Integer>();
    
    // adding the number input as the first element of list
    seqAl.add (num);
    
    //while loop to run as long as num > 1
    while (num > 1)
    {
      //condition 1: if num is even
      if ( (num % 2) == 0)
      {
        num = num/2;
        //add num/2 to the return list
        seqAl.add (num);
      }
      //else case: if num is odd
      else
      {
        num = ((num*3) + 1);
        //add 3(num)+1 to the return list
        seqAl.add (num);
      } 
    } //end of while loop 
    
    // return the list containing the 3N+1 sequence
    return seqAl; 
    
  } //end of three1(num)
  
  
  //main method
  public static void main (String[] args) {
    
    String numStr; //variable to hold number input by user as string
    int num; //variable to hold the number as an integer
    
    //prompting user to input a number for 3N+1 sequence
    numStr = JOptionPane.showInputDialog
      ("<html>Welcome to Samana's <b>3N+1 sequence</b> app!</html>\n"
         + "<html>Enter a <b>positive integer</b> and I will </html>\n"
         + "<html>give you its 3N+1 sequence!:</html>\n");
    
    //parsing the input number from a string to an integer
    num = Integer.parseInt(numStr);
    
    //new arraylist to hold the sequence returned by three1(num)
    ArrayList<Integer> tSequence = three1(num);
    
    //dialogbox to print 3N+1 sequence as a string concatenated with its size
    JOptionPane.showMessageDialog
      (null, "The 3N+1 sequence for " + num + " is \n" 
         + tSequence.toString()  + 
       "\nAnd the size of the sequence is " +
       tSequence.size() + "\n\nGoodbye!");
    
    //command to exit the separate interaction window. 
    System.exit(0);
    
  } //end of main method 
} // end of class ThreeN1
