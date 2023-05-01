package edu.guilford;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Jobs implements Comparable<Doctor> {
    //attributes
    private int numberOfPatients;
    private String specialization; 
    private String hospital; 

    //create constructor that generates random values for the attributes
    public Doctor() {
        //random array of specializations
        String[] specializations = {"Pediatrics", "Cardiology", "Neurology", "Oncology", "Dermatology", "Gynecology", "Psychiatry", "Radiology", "Anesthesiology", "Ophthalmology", "Orthopedics", "Urology", "Endocrinology", "Gastroenterology", "Hematology", "Nephrology", "Pulmonology", "Rheumatology", "Allergy and Immunology", "Infectious Disease", "Otolaryngology", "Pathology", "Physical Medicine and Rehabilitation", "Plastic Surgery", "Preventive Medicine", "Sports Medicine", "Thoracic Surgery", "Vascular Surgery", "Colon and Rectal Surgery", "Family Medicine", "Internal Medicine", "Emergency Medicine", "General Surgery", "Obstetrics and Gynecology", "Oral and Maxillofacial Surgery", "Osteopathic Medicine", "Podiatry", "Neurosurgery", "Nuclear Medicine", "Pain Medicine", "Sleep Medicine", "Interventional Radiology", "Interventional Cardiology", "Clinical Cardiac Electrophysiology", "Geriatric Medicine", "Hospital Medicine", "Palliative Medicine", "Sleep Medicine", "Medical Genetics", "Neonatology", "Nuclear Medicine", "Pain Medicine", "Sleep Medicine", "Interventional Radiology", "Interventional Cardiology", "Clinical Cardiac Electrophysiology", "Geriatric Medicine", "Hospital Medicine", "Palliative Medicine", "Sleep Medicine", "Medical Genetics", "Neonatology"};
        specialization = specializations[(int)(Math.random() * specializations.length)];
        //create a random array with the names of hospitals
        //I got this list from https://www.beckershospitalreview.com/100-great-hospitals-in-america-2019.html
        //Grab the hospital names from the list and put them in an array
        String[] hospitals = {"AdventHealth Orlando", "Advocate Christ Medical Center", "Advocate Good Samaritan Hospital", "Advocate Illinois Masonic Medical Center", "Advocate Lutheran General Hospital", "Advocate Sherman Hospital", "Akron General Medical Center", "Alaska Regional Hospital", "Albany Medical Center", "Alta Bates Summit Medical Center", "Anne Arundel Medical Center", "Asante Rogue Regional Medical Center", "Aspirus Wausau Hospital", "Atrium Health Pineville", "Aurora St. Luke's Medical Center", "Baptist Health Lexington", "Baptist Health Louisville", "Baptist Health South Florida", "Baptist Hospital of Miami", "Barnes-Jewish Hospital", "Baylor Scott & White All Saints Medical Center - Fort Worth", "Baylor Scott & White Medical Center - Grapevine", "Baylor Scott & White Medical Center - Hillcrest", "Baylor Scott & White Medical Center - Plano", "Baylor University Medical Center", "Beaumont Hospital, Royal Oak", "Beaumont Hospital, Troy", "Bethesda North Hospital", "Billings Clinic Hospital", "BJC HealthCare Barnes-Jewish St. Peters Hospital", "BJC HealthCare Christian Hospital", "BJC HealthCare Missouri Baptist Medical Center", "BJC HealthCare Progress West Hospital", "BJC HealthCare St. Louis Children's Hospital", "BJC HealthCare St. Luke's Hospital", "BJC HealthCare St. Luke's Hospital - Chesterfield", "BJC HealthCare St. Luke's Hospital - Des Peres", "BJC HealthCare St. Luke's Hospital - St. Louis", "BJC HealthCare St. Luke's Hospital - WingHaven", "BJC HealthCare St. Luke's Rehabilitation Hospital", "BJC HealthCare St. Luke's Urgent Care - Ellisville", "BJC HealthCare St. Luke's Urgent Care - Kirkwood", "BJC HealthCare St. Luke's Urgent Care - Ladue", "BJC HealthCare St. Luke's Urgent Care - O'Fallon", "BJC HealthCare St. Luke's Urgent Care - St. Charles", "BJC HealthCare St. Luke's Urgent Care - St. Louis", "BJC HealthCare St. Luke's Urgent Care - Webster Groves", "BJC Health"};
        hospital = hospitals[(int)(Math.random() * hospitals.length)];
        //random number of patients
        //"The number typically used when discussing the standard panel size for a primary care 
        //physician is 2,500 patients per doctor, although many patients are not active."
        //I don't know if this is true, but I found it on the internet and I'll go with it for now. 
        numberOfPatients = (int)(Math.random() * 1000);
    }

    //Constructor that takes in values for the attributes
    public Doctor(int numberOfPatients, String specialization, String hospital) {
        this.numberOfPatients = numberOfPatients;
        this.specialization = specialization;
        this.hospital = hospital;
    }

    //getters and setters
    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        //random array of specializations
        String[] specializations = {"Pediatrics", "Cardiology", "Neurology", "Oncology", "Dermatology", "Gynecology", "Psychiatry", "Radiology", "Anesthesiology", "Ophthalmology", "Orthopedics", "Urology", "Endocrinology", "Gastroenterology", "Hematology", "Nephrology", "Pulmonology", "Rheumatology", "Allergy and Immunology", "Infectious Disease", "Otolaryngology", "Pathology", "Physical Medicine and Rehabilitation", "Plastic Surgery", "Preventive Medicine", "Sports Medicine", "Thoracic Surgery", "Vascular Surgery", "Colon and Rectal Surgery", "Family Medicine", "Internal Medicine", "Emergency Medicine", "General Surgery", "Obstetrics and Gynecology", "Oral and Maxillofacial Surgery", "Osteopathic Medicine", "Podiatry", "Neurosurgery", "Nuclear Medicine", "Pain Medicine", "Sleep Medicine", "Interventional Radiology", "Interventional Cardiology", "Clinical Cardiac Electrophysiology", "Geriatric Medicine", "Hospital Medicine", "Palliative Medicine", "Sleep Medicine", "Medical Genetics", "Neonatology", "Nuclear Medicine", "Pain Medicine", "Sleep Medicine", "Interventional Radiology", "Interventional Cardiology", "Clinical Cardiac Electrophysiology", "Geriatric Medicine", "Hospital Medicine", "Palliative Medicine", "Sleep Medicine", "Medical Genetics", "Neonatology"};
        this.specialization = specializations[(int)(Math.random() * specializations.length)];
    }

    public String getHospital() {
        return hospital;
    }

    public String setHospital() {
        return hospital; 
    }

    //abstract method inherited from Jobs
    public void favoriteQuote() {
        //Scanner object
        Scanner scan = new Scanner(System.in);
        //ArrayList names quotes
        ArrayList<String> quotes = new ArrayList<String>();
        //Try-catch block
        try {
            //File
            File file = new File(Doctor.class.getResource("/MedQuotes.txt").toURI());
            //Scanner object that scans the file
            Scanner fileScan = new Scanner(file);
            //check if file is empty
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
        System.out.println(this.getName() + "'s Favorite Medicine Quote:\n " + "\"" + quotes.get((int)(Math.random() * quotes.size())) + "\"\n");
    }
    //toString method from Jobs + our own attributes
    @Override
    public String toString() {
        return super.toString() + "\nSpecialization: " + specialization + "\nHospital: " + hospital + "\nNumber of Patients: " + numberOfPatients + "\n";
    }

    //compareTo method that orders the doctors by number of patients
    public int compareTo(Doctor other) {
        if (this.numberOfPatients > other.numberOfPatients) {
            return 1;
        } else if (this.numberOfPatients < other.numberOfPatients) {
            return -1;
        } else {
            return 0;
        }
    }



}
