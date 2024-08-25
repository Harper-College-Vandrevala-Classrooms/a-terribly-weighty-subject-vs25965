package com.csc;

public class Converter {

  public String toPounds(int ounces) {
   
    public static final int OUNCES_LB = 16;
    double pounds = (ounces/OUNCES_LB);
    if (pounds = 1)
    {
        System.out.printfln("%.4f lb",pounds);
    }
    else  
    {
       System.out.printfln("%.4f lbs",pounds);
    }
        
  }

  public String toPoundsAndOunces(int ounces) {

     public static final int OUNCES_LB = 16;
     int pounds = Math.round(ounces/OUNCES_LB);
     int ouncesout = ((ounces%OUNCES_LB)*OUNCES_LB);

     if (pounds = 1)
     {
       System.out.println(" %d%n lb %d%n oz",pounds,OUNCES_LB);
     }
     else 
     {
       System.out.println(" %d%n lbs %d%n oz",pounds,OUNCES_LB);
     }

  }
}
