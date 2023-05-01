package edu.guilford;

public abstract class Jobs {
    
    //attributes
    private int salary;
    private int yearsExperience;
    private String field;
    private String name; 

    //constructor that generates random values for the attributes
    public Jobs() {
        salary = (int)(Math.random() * 100000);
        yearsExperience = (int)(Math.random() * 25);
        //Random array of job fields
        String[] fields = {"Computer Science", "Biology", "Chemistry", "Physics", "Mathematics", "English", "History", "Art", "Music", "Theatre", "Psychology", "Sociology", "Anthropology", "Philosophy", "Religion", "Economics", "Political Science", "Business", "Marketing", "Accounting", "Finance", "Nursing", "Education", "Criminal Justice", "Engineering", "Foreign Language", "Geology", "Geography", "Astronomy", "Agriculture", "Architecture", "Communications", "Journalism", "Law", "Library Science", "Medicine", "Pharmacy", "Physical Therapy", "Public Health", "Social Work", "Veterinary Medicine"};
        //if subclass is SoftwareEngineer, Professor, or Doctor, set field to the appropriate values
        if (this instanceof SoftwareEngineer) {
            field = "Computer Science";
        }else if (this instanceof Professor) {
            field = "Education";
        }else if (this instanceof Doctor) {
            field = "Medicine";
        }else {
            field = fields[(int)(Math.random() * fields.length)];
        }
        //Random array of first names
        String[] firstName = {"James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Donald", "Mark", "Paul", "Steven", "Andrew", "Kenneth", "George", "Joshua", "Kevin", "Brian", "Edward", "Ronald", "Timothy", "Jason", "Jeffrey", "Ryan", "Jacob", "Gary", "Nicholas", "Eric", "Stephen", "Jonathan", "Larry", "Justin", "Scott", "Brandon", "Benjamin", "Samuel", "Frank", "Gregory", "Raymond", "Alexander", "Patrick", "Jack", "Dennis", "Jerry", "Tyler", "Aaron", "Jose", "Henry", "Douglas", "Adam", "Peter", "Nathan", "Zachary", "Walter", "Kyle", "Harold", "Carl", "Jeremy", "Keith", "Roger", "Gerald", "Ethan", "Arthur", "Terry", "Christian", "Sean", "Lawrence", "Austin", "Joe", "Noah", "Jesse", "Albert", "Bryan", "Billy", "Bruce", "Willie", "Jordan", "Dylan", "Alan", "Ralph", "Gabriel", "Roy", "Juan", "Wayne", "Eugene", "Logan", "Randy", "Louis", "Russell", "Vincent", "Philip", "Bobby", "Johnny", "Bradley"};
        //Random array of last names
        String[] lastName = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores", "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz", "Hayes"};
        //set name to a random first name and last name
        name = firstName[(int)(Math.random() * firstName.length)] + " " + lastName[(int)(Math.random() * lastName.length)];
    }

    //constructor that takes in values for the attributes
    public Jobs(int salary, int yearsExperience, String field, String name) {
        this.salary = salary;
        this.yearsExperience = yearsExperience;
        this.field = field;
        this.name = name; 
    }

    //getters and setters for field

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //abstract method that will be implemented in the subclasses
    public abstract void favoriteQuote();

    //One method inherited by all subclasses (toString)
    @Override
    public String toString() {
        return "Name: " + name + "\nSalary: $" + salary + "\nHours: " + yearsExperience + "\nField: " + field;
    }

    



    


}
