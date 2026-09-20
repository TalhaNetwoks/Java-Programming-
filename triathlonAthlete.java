import java.nio.file.SecureDirectoryStream;
import java.util.Scanner;
public class triathlonAthlete {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        //Name : Muhammad Talha
        // HIM no: 2614020089 

        // now i have to assigne varaibles to all 
        double runningDuration, SwimmingDuratiaon, cyclingDuration;
        double bodayweight;
        double runningSpeed, swimmingSpeed, cyclingSpeed;
        double altitude;
        double dailyTarget;

        //enter the value which is fixed by the case Studay 
        double RUNNING_COEFF = 0.05;
        double SWIMMING_COEFF = 0.04;
        double CYCLING_COEFF = 0.03;

        //get the boday weight and altituid same through out the program 
         
        System.out.println("ENter the weight of the boday (kg):" );
        bodayweight = input.nextDouble();

        System.out.println("ENter the altitude ( in metters) : ");
        altitude = input.nextDouble();

        // now get the input for the reunning duration and speed 
        System.out.println("Enter the Duration of the running (in mint) : " );
        runningDuration = input.nextDouble(); // input the running duration in mint
        System.out.println("your duration of running is : " + runningDuration);
  
        System.out.println("Enter the Speed of the running (km/h) : " );
        runningSpeed = input.nextDouble(); // input the running duration in mint
        System.out.println("your speed of running  is : " + runningSpeed );


        // get the input for the Swimming Duration and speed 
        System.out.println("Enter the Duration of the Swimming (in mint) :  ");
        SwimmingDuratiaon = input.nextDouble();
        System.out.println("Your Duration of Swimming is : " + SwimmingDuratiaon);

        System.out.println("Enter the speed of the Swimming (km/h) :  ");
        swimmingSpeed = input.nextDouble();
        System.out.println("Your Duration of Swimming is : " + swimmingSpeed);

        //get the input for the cycling speed and duration 
         System.out.println("ENter the Duration for the CyclingDuration : "); 
         cyclingDuration = input.nextDouble();
         System.out.println("Your Duration of Cycling is : " + cyclingDuration);

          System.out.println("ENter the speed for the Cycling km/h : "); 
         cyclingSpeed = input.nextDouble();
         System.out.println("Your Duration of Cycling is : " + cyclingSpeed);


         //Daily calories target to achive 

         System.out.println("Enter your darily target of calories in ");
         dailyTarget = input.nextDouble();
         System.out.println("Your daily target of Calories is : " + dailyTarget);

         // now find and put the formula for every game to find the total calories for that game 
         // formlua is  calories = (duration*coefficient*bodayweight) + (average speed * 0.5) + (altitude * 0.01)

         // for .... Running 

         double runningCalories = ((runningDuration * RUNNING_COEFF * bodayweight) + (runningSpeed*0.5) + (altitude*0.01));

          // for .... swmming

         double swimmingCalories = ((SwimmingDuratiaon* SWIMMING_COEFF * bodayweight) + (swimmingSpeed*0.5) + (altitude*0.01));

          // for .... Cycling

         double cyclingCalories = ((runningDuration * RUNNING_COEFF * bodayweight) + (runningSpeed*0.5) + (altitude*0.01));

         // Total calories 

         double totalCalories = (runningCalories + swimmingCalories + cyclingCalories);


        //Total duration (needed for average calories per minute) 
         double totalDuration = runningDuration + SwimmingDuratiaon + cyclingDuration;

        // Average calories burned per minute 
         double averageCaloriesPerMinute = totalCalories / totalDuration;

        // Percentage of daily calorie target achieved
         double percentageAchieved = (totalCalories / dailyTarget) * 100;
         
         // now print all the result for the ecatec valuse for all the games 

         System.out.println("\n --------- THe COmplete Result is --------");

        
         System.out.println("Calories burned running: " + runningCalories);
         System.out.println("Calories burned swimming: " + swimmingCalories);
         System.out.println("Calories burned cycling: " + cyclingCalories);
         System.out.println("Total calories burned: " + totalCalories);
         System.out.println("Average calories burned per minute: " + averageCaloriesPerMinute);
         System.out.println("Percentage of daily target achieved: " + percentageAchieved + "%");





     input.close();
    }
    
}
