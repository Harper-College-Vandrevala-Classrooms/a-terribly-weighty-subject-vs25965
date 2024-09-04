package com.csc;
import java.io.*;
import java.util.Scanner;

public class Converter {
    
  public static void main (String [] args)
{
  System.out.println("Enter a number to convert to pounds ");
     Scanner in = new Scanner(System.in);
     int ounces = in.nextInt();
     toPounds (ounces);
     toPoundsAndOunces(ounces);
     
     

}
public static void toPounds (int ounces) {

      String output;
      String output2;
      double OUNCES_LB = 16;
      double pounds = (ounces/OUNCES_LB);
       if (pounds == 1)
      {
         output = String.format("%.4f",pounds) + " lb";
         System.out.println(output);
          
      }
      else  
      {
         output2 = String.format("%.4f",pounds) + " lb"; 
         System.out.println(output2);
      }  
      
    }
    
    
    public static void toPoundsAndOunces(int ounces) {

      String output1;
      String output3;
      int Oz_Lb = 16;
      int pounds1 = Math.round(ounces/Oz_Lb);
      int ouncesout = (ounces%Oz_Lb);
 
      if (pounds1 == 1)
      {
        output1 = pounds1 + " lb  " + ouncesout + " oz"; 
        System.out.println(output1);
      }
      else 
      {
        output3 = pounds1 + " lbs  " + ouncesout + " oz"; 
        System.out.println(output3);
      }

       } 
   }
   
   
 
    


 

