/*
Lab 4
Partners: John Mayer and Anthony Hale
Date: 2/9/2021
*/
import java.util.Random;
class Main {  
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(51);
    System.out.println("The Random number is:" + randomNum);

    if ( randomNum <= 15) 
    {
      while(randomNum >= 0)
      {
	    System.out.println(randomNum);
      randomNum--;
      }
    System.out.println("Ahoy Matey!");
    }


   else if(randomNum > 20 && randomNum < 42) 
    {
    while(randomNum >= 0)
     {
	    System.out.println(randomNum);
      randomNum--;
     }
        System.out.println("Cannonball!");
    }

    
    else{ 
      while(randomNum>=0)
      {
        System.out.println(randomNum);
        randomNum--;
      }
      System.out.println("Look, a sea shanty!");
    }
  }
}