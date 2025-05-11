# Simple E-Channeling System in Java

This is a basic command-line application that simulates a doctor channeling (appointment booking) system.

## How to Run

1.  **Install Java:** Ensure you have the Java Development Kit (JDK) installed on your computer.
2.  **Get the Code:** Download or clone this repository containing the `.java` files (`patient.java`, `Doctor.java`, `Appointment.java`, `Testclass.java`).
3.  **Compile:** Open a terminal or command prompt in the directory where you saved the files and compile them using the Java compiler:

    ```bash
    javac *.java
    ```

    *(If the files are in a package, for example, `lab11`, you might need to compile like this: `javac lab11/*.java`)*

4.  **Execute:** Run the main program (`Testclass`) using the Java Virtual Machine:

    ```bash
    java Testclass
    ```

    *(If the files are in a package, for example, `lab11`, you might need to run it like this: `java lab11.Testclass`)*

5.  **Follow Prompts:** The application will guide you through the steps to book an appointment.

## What this System Does (Doctor Channeling)

This system aims to provide a simple way for a patient to book an appointment with a doctor. It simulates a basic channelling process by:

* **Presenting Available Doctors:** Displaying a list of doctors with their specializations to the patient.
* **Allowing Doctor Selection:** Enabling the patient to choose a doctor from the list.
* **Offering Time Slots:** Showing the available time slots for the selected doctor.
* **Confirming Appointments:** Providing a confirmation of the booked appointment with the patient's details, the doctor's name, and the chosen time.

## Facilities Achieved

This initial version achieves the following basic facilities:

* **Patient Input:** Allows a patient to enter their name and account number.
* **Doctor Listing:** Provides a predefined list of doctors with their specializations.
* **Doctor Selection:** Enables the patient to select a doctor by number.
* **Time Slot Display:** Shows a set of predefined time slots for the chosen doctor.
* **Time Slot Selection:** Allows the patient to select a time slot by number.
* **Appointment Confirmation:** Displays a confirmation message to the patient.

## Advantages (Even in its Simplicity)

Even in its simple, command-line form, this E-Channeling System demonstrates several potential advantages:

* **Organization:** It provides a structured way to manage appointment bookings, compared to relying on manual methods like phone calls or paper records.
* **Clarity:** It clearly presents available doctors and time slots, reducing ambiguity and potential errors in scheduling.
* **Basic Automation:** It automates the process of recording patient details and booking information, saving time and effort.
* **Foundation for Expansion:** This code serves as a solid foundation that can be expanded to create a more robust and feature-rich channeling system (e.g., with a database, GUI, and more advanced scheduling).
* **Learning Tool:** It's a valuable educational tool for understanding object-oriented programming concepts in Java and how to build a basic interactive system.

## Author

Buddhika [https://www.linkedin.com/in/dilshan-buddhika-wickramasinghe-436009292/]
