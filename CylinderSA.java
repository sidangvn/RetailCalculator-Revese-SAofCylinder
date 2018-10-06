//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang


import java.util.Scanner;

public class CylinderSA
{
  public static void main(String [] args)
   {
   
   //Input values
   Scanner input= new Scanner(System.in);
   
   //Variables to store
   double r, h;
   
   //Prompts the users input values
   System.out.print("Enter the cylinder's radius: ");
   r = input.nextDouble();
   System.out.print("Enter the cylinder's height: ");
   h = input.nextDouble();
   
   //output with called method
   System.out.println("The surface area of a cylinder is: " + area(r,h));
   
   }
   
  //method
  public static double area( double i1, double i2)//i1 is r, i2 is h form main method
   {
      
      double A = 2 * Math.PI*i1*i2 + 2*Math.PI*i1*i1; //Calculation with math class
      
      return A; //return
      }
   }
         
         
      
      