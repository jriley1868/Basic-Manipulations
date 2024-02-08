/*
Author: James Riley
Location: Home/Dorm
Tutors: None
*/

import java.util.Scanner;

public class RileyJ_P1
{
  
   public static void main(String[] args)
   {
     //Creating Scanner
     Scanner keyboard = new Scanner(System.in);
     //Asking user to input
     System.out.println("Enter the name of a school: ");
     //Storing Input
     String school = keyboard.nextLine();
     System.out.println("Enter the name of a person: ");
     String person1 = keyboard.nextLine();
     System.out.println("Enter the name of another person: ");
     String person2 = keyboard.nextLine();
     System.out.println("Enter a color: ");
     String color1 = keyboard.nextLine();
     System.out.println("Enter another color: ");
     String color2 = keyboard.nextLine();
     System.out.println("Enter a positive integer: ");
     //Declaring integer
     int years = keyboard.nextInt();
     int halfYears = years / 2;
     System.out.println("Enter a food: ");
     //Buffer
     keyboard.nextLine();
     String food1 = keyboard.nextLine();
     String food1AllCaps = food1.toUpperCase();
     System.out.println("Enter another food");
     String food2 = keyboard.nextLine();
     System.out.println("Enter a personal pronoun: ");
     String pronoun = keyboard.nextLine();
     System.out.println("Enter an adjective: ");
     String adjective1 = keyboard.nextLine();
     System.out.println("Enter another adjective: ");
     String adjective2 = keyboard.nextLine();
     System.out.println("Enter an adverb: ");
     String adverb = keyboard.nextLine();
     System.out.println("Enter number with a decimal point: ");
     //Declaring double
     double radius = keyboard.nextDouble();
     //Circle area equation
     double searchArea = Math.PI * Math.pow(radius,2);
     int eachSearchArea = (int) searchArea / 2;
     System.out.println("Enter a unit of distance measurement in plural form: ");
     //Buffer
     keyboard.nextLine();
     String distanceUnits = keyboard.nextLine();
     System.out.println("Enter a unit of time measurement in plural form: ");
     String timeUnits = keyboard.nextLine();
     //Printf
     System.out.printf("\n%d years ago at %s the esteemed %s desperately needed to find a %s %s.",
                        years, school, person1, color1, food1);
     System.out.printf("\n%s searched and searched for the evasive %s %s but alas the %s was never found.",
                        pronoun, color1, food1, food1);
     System.out.printf("\n%d years after the search began %s enlisted the help of %s the %s.",
                        halfYears, person1, person2, adjective1);
     System.out.print("\nIt turns out that this might have been " + person1 + "'s fatal mistake.");
     System.out.printf("\nYou see, %s suggested that they focus their search only on %s.",
                        person2, school);
     System.out.printf("\nThey would create a circle to seach around the school and run around shouting \"%s\" !!\" %s \"!!",
                        food1AllCaps, food1AllCaps);
     System.out.printf("\nThe search parameter was going to be %f square %s.",
                        searchArea, distanceUnits);
     System.out.println("\nThat is roughly " + eachSearchArea + " square " + distanceUnits + "each.");
     System.out.println("The search could take " + timeUnits + " to complete.");
     
                     
     
     
     
     
         
         
         
         
    }
}
  