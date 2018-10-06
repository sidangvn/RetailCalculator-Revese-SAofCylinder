//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang
//Goals of this program are to understand how to use method and covert number

import java.util.Scanner;
import java.text.NumberFormat;
public class RetailCalculator
{
  public static void main(String [] args)
   {
   
   //Number Format
   NumberFormat ft2 = NumberFormat.getCurrencyInstance();
   NumberFormat ft1 = NumberFormat.getPercentInstance();
   
   //Input values
   Scanner input = new Scanner (System.in);
   
   //Variables to store
   double WholeSale, MarkUp, MarkUp1, MarkUp2;
   
   //Prompts the users input values
   System.out.print("Enter the item's wholesale cost: ");
       WholeSale = input.nextDouble();
   System.out.print("Enter the item's markup percentage (as a %): ");
       MarkUp = input.nextDouble();
           
   //covert % to decimal for calculation       
   MarkUp1=(MarkUp>0 && MarkUp <1)? (MarkUp*100) : MarkUp;
   
   //Output      
   System.out.println("The item's retail price (at a " + (int)MarkUp1 + "% markup) is " + ft2.format(retailPrice(WholeSale, MarkUp1)));
     }
   
   //Method for calculation retailPrice      
   public static double retailPrice (double  i1, double i2) //i1 is WholeSale, i2 is MarkUp1
      {  
      
      double retail = i1 + (i1*i2/100); //calculation
         
      return retail; //return
       }
}