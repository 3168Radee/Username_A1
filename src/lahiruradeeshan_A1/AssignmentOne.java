package lahiruradeeshan_A1;

import java.util.ArrayList;

public class AssignmentOne {

    // Part 5 – Collection of appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        
        // Part 3 – Using classes and objects
        
        // Creating three General Practitioner objects
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice Smith", "Primary Care", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob Jones", "Family Medicine", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Carol White", "Primary Care", true);

        // Creating two Cardiologist objects
        Cardiologist cardiologist1 = new Cardiologist(201, "Dr. David Brown", "Cardiology", "Victoria General Hospital");
        Cardiologist cardiologist2 = new Cardiologist(202, "Dr. Eva Green", "Cardiology", "Melbourne Heart Clinic");

        // Printing details of each General Practitioner
        gp1.printDetails();
        System.out.println("------------------------------");
        
        gp2.printDetails();
        System.out.println("------------------------------");

        gp3.printDetails();
        System.out.println("------------------------------");

        // Printing details of each Cardiologist
        cardiologist1.printDetails();
        System.out.println("------------------------------");

        cardiologist2.printDetails();
        System.out.println("------------------------------");
        
        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments");
        System.out.println("------------------------------");

        // Creating appointments
        createAppointment("John Doe", "123-456-7890", "10:00", gp1);
        createAppointment("Jane Smith", "234-567-8901", "11:30", gp2);
        createAppointment("Michael Johnson", "345-678-9012", "09:15", cardiologist1);
        createAppointment("Emily Davis", "456-789-0123", "14:00", cardiologist2);

        // Print all existing appointments
        printExistingAppointments();
        System.out.println("------------------------------");

        // Cancel an appointment
        cancelBooking("234-567-8901");

        // Print updated list of appointments
        printExistingAppointments();
        System.out.println("------------------------------");
    }

    // Method to create and add an appointment
    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() && mobilePhone != null && !mobilePhone.isEmpty() && timeSlot != null && !timeSlot.isEmpty() && doctor != null) {
            Appointment appointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
            appointments.add(appointment);
            System.out.println("Appointment created for " + patientName);
        } else {
            System.out.println("Failed to create appointment. All details must be provided.");
        }
    }

    // Method to print all existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    // Method to cancel an appointment by mobile phone number
    public static void cancelBooking(String mobilePhone) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobilePhone().equals(mobilePhone)) {
                appointments.remove(i);
                System.out.println("Appointment with mobile number " + mobilePhone + " has been cancelled.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found with mobile number " + mobilePhone);
        }
    }
}
