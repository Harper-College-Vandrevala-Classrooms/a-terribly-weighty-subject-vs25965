
package com.csc;
import java.io.*;

public class Converter {
 
    public String toPounds (int ounces) {

      String output;
      String output2;
      double OUNCES_LB = 16;
      double pounds = (ounces/OUNCES_LB);
       if (pounds == 1)
      {
         output = String.format("%.4f",pounds) + " lb";
          return output;
          
      }
      else  
      {
         output2 = String.format("%.4f",pounds) + " lb"; 
         return output2;
      }  
    }
    
    
    public String toPoundsAndOunces(int ounces) {

      String output1;
      String output2;
      int Oz_Lb = 16;
      int pounds1 = Math.round(ounces/Oz_Lb);
      int ouncesout = (ounces%Oz_Lb);
 
      if (pounds1 == 1)
      {
        output1 = pounds1 + " lb  " + ouncesout + " oz"; 
        return output1;
      }
      else 
      {
        output2 = pounds1 + " lbs  " + ouncesout + " oz"; 
        return output2;
      }
   }

  }

