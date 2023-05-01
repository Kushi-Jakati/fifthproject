package edu.guilford;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareEngineer extends Jobs implements Comparable<SoftwareEngineer>{
    //attributes
    private boolean remote;
    private String specialization;
    private int numOfProgLangKnown;

    //constructor that generates random values for the attributes
    public SoftwareEngineer() {
        remote = (Math.random() < 0.5);
        //Random array of specializations
        String[] specializations = {"Web Development", "Mobile Development", "Data Science", "Machine Learning", "Artificial Intelligence", "Cybersecurity", "Game Development", "Embedded Systems", "DevOps", "Cloud Computing", "Database Administration", "Systems Administration", "Systems Architecture", "Systems Engineering", "Network Engineering", "Network Administration", "Quality Assurance", "Software Testing"};
        specialization = specializations[(int)(Math.random() * specializations.length)];
        numOfProgLangKnown = (int)(Math.random() * 10);
        //Wikipedia says there are 700 programming languages, but for
        //realistic purposes, I'm going to say that the average software engineer knows at most 10% of them
    }

    //constructor that takes in values for the attributes
    public SoftwareEngineer(boolean remote, String specialization, int numOfFundProgLangKnown) {
        this.remote = remote;
        this.specialization = specialization;
        this.numOfProgLangKnown = numOfFundProgLangKnown;
    }

    //getters and setters for remote
    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    public boolean getRemote() {
        return remote;
    }

    //getters and setters for specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    //getters and setters for numOfProgLangKnown
    public void setNumOfProgLangKnown(int numOfProgLangKnown) {
        this.numOfProgLangKnown = numOfProgLangKnown;
    }

    public int getNumOfProgLangKnown() {
        return numOfProgLangKnown;
    }

    @Override
    public void setField(String field) {
        // TODO Auto-generated method stub
        super.setField("Computer Science");
    }


    //One abstract method inherited by Jobs
    public void favoriteQuote() {
        //Scanner object
        Scanner scan = new Scanner(System.in);
        //ArrayList names quotes
        ArrayList<String> quotes = new ArrayList<String>();
        //Try-catch block
        try {
            //File
            File file = new File(SoftwareEngineer.class.getResource("/CompSciQuotes.txt").toURI());
            //Scanner object that scans the file
            Scanner fileScan = new Scanner(file);
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
        System.out.println(this.getName() + "'s Favorite Comp Sci Quote:\n " + "\"" + quotes.get((int)(Math.random() * quotes.size())) + "\"\n");
    }


    //A toString method inherited by Jobs
    @Override
    public String toString() {
        return super.toString() + "\nRemote: " + remote + "\nSpecialization: " + specialization + "\nNumber of Programming Languages Known: " + numOfProgLangKnown + "\n";
    }

    //A compareTo method to order objects by salary
    //inherits from Comparable and Jobs
    public int compareTo(SoftwareEngineer other) {
        if (this.getSalary() > other.getSalary()) {
            return 1;
        }else if (this.getSalary() < other.getSalary()) {
            return -1;
        }else {
            return 0;
        }
    }


}
