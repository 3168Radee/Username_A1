package lahiruradeeshan_A1;

public class Cardiologist extends HealthProfessional {

    // Instance variable specific to Cardiologist
    private String hospitalAffiliation;

    // Default constructor
    public Cardiologist() {
        super();  // Calls the default constructor of HealthProfessional
        this.hospitalAffiliation = "Unknown";
    }

    // Parameterized constructor to initialize all variables
    public Cardiologist(int id, String name, String specialization, String hospitalAffiliation) {
        super(id, name, specialization);  // Calls the parameterized constructor of HealthProfessional
        this.hospitalAffiliation = hospitalAffiliation;
    }

    // Method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();  // Calls the printDetails method of HealthProfessional
        System.out.println("Type: Cardiologist");
        System.out.println("Hospital Affiliation: " + hospitalAffiliation);
    }

    // Getters and Setters (optional)
    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(String hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }
}

