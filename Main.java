//Bhuvan Sakhamuru, 6th Hour, Cohort C
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
  
  //insert data declarations
  double height = 0, weight = 0, BMI = 0;
  final double normalLow = 18.5, normalHigh = 24.9, maxWeight = 300, minWeight = 45, minObese = 30, maxHeight = 84, minHeight = 48;
  double alterWeight = 0;  
  
  //insert true while loop
  while (true)
  {
    //prompt the user for their height
    System.out.print("\n\nWhat is your height in inches (enter \"0\" to exit): ");
    height = stdin.nextDouble();
    //if the height is 0, exit the loop
    if (height == 0)
    {
      System.out.print("You have exited the calculator.");
      return;
    }
    //else keep going
    else
    {
      //if the height is unrealistic, prompt user for realistic height
      if (height < minHeight || height > maxHeight)
      {
        System.out.print("Enter a realistic adult height (between 48 and 84), try again");
        continue;
      }
      //else keep going
      else
      {
        //prompt the user for their weight
        System.out.print("What is your weight in pounds (enter \"0\" to exit: ");
        weight = stdin.nextDouble();
        if (weight == 0)
        {
         //if the weight is 0, exit the loop
         System.out.print("You have exited the calculator.");
         return;
        }
        //else keep going
        else
        {
          if (weight < minWeight || weight > maxWeight)
          {
           //if the weight is unrealistic, prompt the user to try again
           System.out.print("Enter a realistic adult weight (between 45 and 300), try again");
           continue;
          }
          //else keep going
          else
          {
           //calculate BMI, round it
           BMI = (703 * weight / (height * height));
           BMI = (int)(BMI * 10.0 + 0.5) / 10.0; 
           //if BMI < normalLow
           if (BMI < normalLow)
           {
            //calculate weight needed to gain or lose to get into normal, then round it
            alterWeight = ((normalLow * (height * height)) / 703) - weight ;
            alterWeight = (int)(alterWeight * 10.0 + 0.5) / 10.0 ;
            //tell user their BMI and that they are in Underweight category, and also tell them the weight needed to get into normal
            System.out.print("Your BMI is " + BMI + " , which falls under the underweight category. To get into the normal category, you need to gain " + alterWeight + " pounds");
            continue;
           }
           //else if BMI < normalHigh 
           else if (BMI < normalHigh)
           {
            //tell user their BMI and that they are in normal category
            System.out.print("Your BMI is " + BMI + " , which falls under the normal category. You don't need to gain or lose any weight.");
            continue;
           }
           //else if BMI < minObese
           else if (BMI < minObese)
           {
            //calculate weight needed to gain or lose to get into normal, then round it
            alterWeight = weight - ((normalHigh * (height * height))/703);
            alterWeight = (int)(alterWeight * 10.0 + 0.5) / 10.0 ;
            //tell user their BMI, that they are in overweight, and how much weight they need to lose to get into normal
            System.out.print("Your BMI is " + BMI + " , which falls under the Overweight Category. To get into the Normal Category, you need to lose " + alterWeight + "  pounds.");
            continue;
           }
           //else
           else
           {
            //calculate weight needed to gain or lose to get into normal, then round it
            alterWeight = weight - ((normalHigh * (height * height))/703);
            alterWeight = (int)(alterWeight * 10.0 + 0.5) / 10.0;
            //tell user their BMI, tell them that they are obese, and tell them how much weight they need to lose to get into normal
            System.out.print("Your BMI is " + BMI + " , which falls under the Obese Category. To get into the Normal Category, you need to lose " + alterWeight + " pounds.");
            continue;  
           }
          }
        }
      }
    }
  //end loop
  }
 }
}

              