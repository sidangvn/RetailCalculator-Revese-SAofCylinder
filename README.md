# RetailCalculator-Revese-SAofCylinder - 6 bonus


Retail Price Calculator (20 pts) – RetailCalculator.java
Reverse Number Revised (20 pts) – Reverse.java
Surface Area of a Cylinder (20 pts) - CylinderSA.java
Please make sure to include your pledge in each code
The deadline for this code is March. 13 11:59 pm
 

Retail Price Calculator

Write a program that prompts the user for the wholesale price and markup percentage of an item. The program should invoke a method to calculate the retail price of the item.

You will need:

A scanner object to read the wholesale price and the markup percentage 
(Note: make sure you let the user know how the percentage should be entered. If it is in a percent format like 25% it would need to be converted to decimal for calculations. If the user entered it as a decimal format then no conversion is necessary.)
Variables to store:
     a. The wholesale price (as a double)

     b. The markup (as a double – convert if entered as a %

     c. (Optional: The retail price, which stores the returned retail value from the method. Keep in mind that you can use the method call directly in an output statement.)

 3. A NumberFormat object to display the retail price in currency format (Optional: you can also create a format for the percentage, but it is not as important.)

A method that:
Accepts 2 parameters – the wholesale price and markup percentage
Calculates the retail price
Returns the retail price value
Comments where necessary
 

A sample of the output is shown below:

Enter the item's wholesale cost: 60
Enter the item's markup percentage (as a %): 75
The item's retail price (at a 75% markup) is $105.00

 

Reverse number revised

Listing 6.2 (shown below, pg 277 in the text), is an example that demonstrates the use of a do…while loop to reverse an integer number. Modify the program so that the reversal process is called from a value returning method instead of included in the main program. Use a value returning method that accepts the integer as a parameter and returns the reversed number.

 

import java.util.Scanner;

public class ReverseNumber

{

   //-----------------------------------------------------------------

   // Reverses the digits of an integer mathematically.

   //-----------------------------------------------------------------

   public static void main(String[] args)

   {

     int number, lastDigit, reverse = 0;

     Scanner scan = new Scanner(System.in);

     System.out.print("Enter a positive integer: ");

     number = scan.nextInt();

     //This part needs to go in its own method now ^_^

     do  {

         lastDigit = number % 10;

         reverse = (reverse * 10) + lastDigit;

         number = number / 10;

     } while (number > 0);

 

     //Call your new method here (or within the output statement below)

     System.out.println("That number reversed is " + reverse);

  }

}

 

Surface Area of a Cylinder 

The surface area of a cylinder is written as:

A = 2πrh + 2πr2

Write a program that prompts the user for a radius and height of a cylinder and uses a method to calculate the surface area.

You will need: 

A scanner object to read the radius and the height of the cylinder
Variables to store:
The radius (as a double)
The height (as a double)
(Optional: The area, which stores the returned area from the method. Again, keep in mind that you can use the method call directly in an output statement.)
A method that:
Accepts 2 parameters – the radius and height
Calculates the area
Returns the area
Comments where necessary
 

Tip: Use the PI constant (from the Math Class) – i.e. Math.PI - for π.

 

A sample of the output is shown below: 

Enter the cylinder's radius: 5.5
Enter the cylinder's height: 10
The surface area of a cylinder is: 535.6415474370597
