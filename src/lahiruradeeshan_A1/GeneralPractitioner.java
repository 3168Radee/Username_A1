package lahiruradeeshan_A1;

public class GeneralPractitioner extends HealthProfessional {
    
    // Instance variable specific to General Practitioner
    private boolean bulkBillingAvailability;

    // Default constructor
    public GeneralPractitioner() {
        super();  // Calls the default constructor of HealthProfessional
        this.bulkBillingAvailability = false;
    }

    // Parameterized constructor to initialize all variables
    public GeneralPractitioner(int id, String name, String specialization, boolean bulkBillingAvailability) {
        super(id, name, specialization);  // Calls the parameterized constructor of HealthProfessional
        this.bulkBillingAvailability = bulkBillingAvailability;
    }

    // Method to print details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();  // Calls the printDetails method of HealthProfessional
        System.out.println("Type: General Practitioner");
        System.out.println("Bulk Billing Availability: " + (bulkBillingAvailability ? "Yes" : "No"));
    }

    // Getters and Setters (optional)
    public boolean isBulkBillingAvailable() {
        return bulkBillingAvailability;
    }

    public void setBulkBillingAvailability(boolean bulkBillingAvailability) {
        this.bulkBillingAvailability = bulkBillingAvailability;
    }
}

