
import java.util.Scanner;
import lab11.Appointment;
import lab11.Doctor;
import lab11.patient;

public class Testclass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter patient name:");
        String patient_name = in.nextLine();

        System.out.print("Enter account number::");
        int acc_number = in.nextInt();

        patient patient = new patient(patient_name, acc_number);
        System.out.println("Available doctors:\n"
                + "1. Dr. Saman - Specialization: [Cardiology]\n"
                + "2. Dr. Nimal - Specialization: [Neurology]\n"
                + "3. Dr. Ravi - Specialization: [Pediatrics]\n"
                + "4. Dr. Mohomad - Specialization: [Dermatology]\n"
                + "5. Dr. Kumari - Specialization: [Obstetrics & Gynecology]");

        String Drname[] = {"saman", "Nimal", "Ravi", "Mohomad", "Kumari"};
        String Specialization[] = {"Cardiology", "Neurology", "Pediatrics", "Dermatology", "Obstetrics & Gynecology"};

        System.out.print("Select a doctor by number:");
        int selected_doctor = in.nextInt();

        Doctor select1 = new Doctor(Drname[selected_doctor-1], Specialization[selected_doctor-1]);
        System.out.println("1. 2024-03-31 09:00\n"
                + "2. 2024-03-31 09:30\n"
                + "3. 2024-03-31 10:00\n"
                + "4. 2024-03-31 10:30\n"
                + "5. 2024-03-31 11:00");
        System.out.print("Select a time slot by number:");
        int selected_time = in.nextInt();

        String time[] = {"2024-03-31 09:00", "2024-03-31 09:30", "2024-03-31 10:00", "2024-03-31 10:30", "2024-03-31 11:00"};
        Appointment time1=new Appointment(time[selected_time-1]);
        
        System.out.printf("Appointment booked for %s with %s at %s",patient.getName(),select1.getDrname(),time1.getTime());
    }
}
