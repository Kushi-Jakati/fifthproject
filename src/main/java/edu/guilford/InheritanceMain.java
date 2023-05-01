package edu.guilford;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class InheritanceMain 
{
    public static void main( String[] args ) throws URISyntaxException
    {
        //Generate a number of software engineers and 
        //put them in an array
        SoftwareEngineer[] softwareEngineers = new SoftwareEngineer[3];
        for (int i = 0; i < softwareEngineers.length; i++) {
            softwareEngineers[i] = new SoftwareEngineer();
        }

        //Generate a number of professors and put them in an array
        Professor[] professors = new Professor[3];
        for (int i = 0; i < professors.length; i++) {
            professors[i] = new Professor();
        }

        //Generate a number of doctors and put them in an array
        Doctor[] doctors = new Doctor[3];
        for (int i = 0; i < doctors.length; i++) {
            doctors[i] = new Doctor();
        }

        System.out.println("Here are the software engineers, professors, and doctors printed out through toString, which was inherited by the Jobs class but also overridden:\n");

        //Print UnSorted
        System.out.println("Unsorted Software Engineers:\n");
        //Print out the software engineers
        for (int i = 0; i < softwareEngineers.length; i++) {
            System.out.println(softwareEngineers[i]);
        }
        //Order the software engineers by salary and number of programming languages known
        //using the compareTo method and Array sort
        Arrays.sort(softwareEngineers);

        //Print out the software engineers again
        System.out.println("\nSorted Software Engineers (by salary):\n");
        for (int i = 0; i < softwareEngineers.length; i++) {
            System.out.println(softwareEngineers[i].toString());
        }

        //Print UnSorted Professors
        System.out.println("Unsorted Professors:\n");
        //Print out the professors
        for (int i = 0; i < professors.length; i++) {
            System.out.println(professors[i]);
        }
        //Order the professors by salary and number of programming languages known
        //using the compareTo method and Array sort
        Arrays.sort(professors);

        //Print out the professors again
        System.out.println("\nSorted Professors (by university, in alphabetic order):\n");
        for (int i = 0; i < professors.length; i++) {
            System.out.println(professors[i]);
        }

        //Print UnSorted Doctors
        System.out.println("Unsorted Doctors:\n");
        //Print out the doctors
        for (int i = 0; i < doctors.length; i++) {
            System.out.println(doctors[i]);
        }
        //Order the doctors by patients 
        //using the compareTo method and Array sort
        Arrays.sort(doctors);

        //Print out the doctors again
        System.out.println("\nSorted Doctors (by # of patients):\n");
        for (int i = 0; i < doctors.length; i++) {
            System.out.println(doctors[i]);
        }

        //Abstract method demonstration
        System.out.println("Here is a software engineer's, doctor's, and professor's favorite quote (respectively) for their fields. This was built from the abstract method of the Jobs class\n");
        //Random number between 1 and 3
        Random rand = new Random();
        int randomNum = rand.nextInt(2) + 1;
        softwareEngineers[randomNum].favoriteQuote();
        professors[randomNum].favoriteQuote();
        doctors[randomNum].favoriteQuote();

        // //inherited method demonstration
        // System.out.println(softwareEngineers[randomNum].toString());
        // System.out.println(professors[randomNum].toString());

    }
}
