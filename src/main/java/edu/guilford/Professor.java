package edu.guilford;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Jobs implements Comparable<Professor>{

    // attributes
    private String universities;
    private String subject;
    private int numOfClasses;

    // constructor that generates random values for the attributes
    public Professor() {
        //Random array of universities across the country
        String[] universities = {"Yale University", "Harvard University", "Princeton University", "Columbia University", "Massachusetts Institute of Technology", "Stanford University", "University of Chicago", "University of Pennsylvania", "California Institute of Technology", "Johns Hopkins University", "Duke University", "Northwestern University", "Dartmouth College", "Brown University", "Vanderbilt University", "Rice University", "Washington University in St. Louis", "Cornell University", "University of Notre Dame", "University of California, Berkeley", "Emory University", "Georgetown University", "University of California, Los Angeles", "University of Southern California", "Carnegie Mellon University", "University of Virginia", "Wake Forest University", "Tufts University", "University of Michigan", "University of North Carolina at Chapel Hill", "Boston College", "New York University", "University of Rochester", "Brandeis University", "College of William & Mary", "Georgia Institute of Technology", "University of California, Davis", "University of California, San Diego", "University of California, Santa Barbara", "University of California, Irvine", "University of California, Santa Cruz", "University of Florida", "University of Miami", "University of Texas at Austin", "University of Washington", "Case Western Reserve University", "Lehigh University", "Pennsylvania State University", "Rensselaer Polytechnic Institute", "University of Wisconsin-Madison", "University of Illinois at Urbana-Champaign", "University of Maryland, College Park", "University of Georgia", "University of California, Riverside", "University of Connecticut", "University of Delaware", "University of Massachusetts Amherst", "University of Pittsburgh", "University of California, Santa Barbara", "University of California, Irvine", "University of California, Santa Cruz", "University of Florida", "University of Miami", "University of Texas at Austin", "University of Washington", "Case Western Reserve University", "Lehigh University", "Pennsylvania State University", "Rensselaer Polytechnic Institute", "University of Wisconsin-Madison", "University of Illinois at Urbana-Champaign", "University of Maryland, College Park", "University of Georgia", "University of California, Riverside", "University of Connecticut", "University of Delaware", "University of Massachusetts Amherst", "University of Pittsburgh"};
        this.universities = universities[(int)(Math.random() * universities.length)];
        //Random array of subjects
        String[] subjects = {"Computer Science", "Biology", "Chemistry", "Physics", "Mathematics", "English", "History", "Art", "Music", "Theatre", "Psychology", "Sociology", "Anthropology", "Philosophy", "Religion", "Economics", "Political Science", "Business", "Marketing", "Accounting", "Finance", "Nursing", "Education", "Criminal Justice", "Engineering", "Foreign Language", "Geology", "Geography", "Astronomy", "Agriculture", "Architecture", "Communications", "Journalism", "Law", "Library Science", "Medicine", "Pharmacy", "Physical Therapy", "Public Health", "Social Work", "Veterinary Medicine"};
        this.subject = subjects[(int)(Math.random() * subjects.length)];
        this.numOfClasses = (int)(Math.random() * 6);
    }

    // constructor that takes in values for the attributes
    public Professor(String universities, String subject, int numOfClasses) {
        this.universities = universities;
        this.subject = subject;
        this.numOfClasses = numOfClasses;
    }

    // getters and setters for universities
    public String getUniversities() {
        return universities;
    }

    public void setUniversities(String universities) {
        this.universities = universities;
    }

    // getters and setters for subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // getters and setters for numOfClasses
    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
    }

    // toString method from Jobs class
    @Override
    public String toString() {
        return super.toString() + "\nUniversity: " + universities + "\nSubject: " + subject + "\nNumber of Classes: " + numOfClasses + "\n";
    }

    // jobDescription abstract method from Jobs class
    public void favoriteQuote() {
        //Scanner object
        Scanner scan = new Scanner(System.in);
        //ArrayList names quotes
        ArrayList<String> quotes = new ArrayList<String>();
        //Try-catch block
        try {
            //File
            File file = new File(Professor.class.getResource("/EduQuotes.txt").toURI());
            //Scanner object that scans the file
            Scanner fileScan = new Scanner(file);
            //Check if file is empty
            if (!fileScan.hasNextLine()) {
                System.out.println("File is empty.");
            }
            //While loop that adds each line of the file to the array
            while (fileScan.hasNextLine()) {
                String quote = fileScan.nextLine();
                quotes.add(quote);
            }
            //Closes the file
            fileScan.close();
        }catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Prints a random index of the array
        System.out.println(this.getName() + "'s Favorite Education Quote:\n " + "\"" + quotes.get((int)(Math.random() * quotes.size())) + "\"\n");
    }

    // compareTo method from Comparable interface, comparing university alphabetically for sorting
    public int compareTo(Professor p) {
        return this.universities.compareTo(p.universities);
    }
}
