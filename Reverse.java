//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang
//Goals of this program are how to use method and understand how to change a program without 2nd method to a program which has 2nd method

import java.util.Scanner;

public class Reverse

{

   //-----------------------------------------------------------------

   // Reverses the digits of an integer mathematically.

   //-----------------------------------------------------------------

   public static void main(String[] args)

   {

     int number, lastDigit, reverse=0;

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter a positive integer: ");

     number = scan.nextInt();
     
     System.out.println("That number reversed is " + reve(number)); //call method

   }
     
  //Method     
   public static int reve(int num) //num is number is main method
     {
     
         int reverse = 0;  
              
      do  
      {   
       int lastDigit = num % 10;
       reverse = (reverse * 10) + lastDigit;
       num = num / 10;

       } while (num > 0);

       return reverse; //return
    
       }

      }

 