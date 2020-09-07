package com.stackroute;
import java.util.HashSet;
import java.util.Set;

/*PatientService class to add, search patients*/

public class PatientService {
    Set<Patient> patients = new HashSet();

    public void addPatient(int registrationNumber, String name, char gender) {
        Patient patient = new Patient();    //created object for Patient
/*Set values to the class patient*/
        patient.setRegistrationNumber(registrationNumber);
        patient.setName(name);
        patient.setGender(gender);
        patients.add(patient);
        /*Display list at each addition to list*/
        System.out.println(patients);

    }

/*Method to search patient from given registration number*/
    public void searchPatient(int registrationNumber) {
        for (Patient patient : patients) {
            if (patient.getRegistrationNumber() == registrationNumber) {
                System.out.println("\n"+patient);
                break;
            } else {
                System.out.println("Patient not found");
            }
        }
    }
/*Method to return set of patients with given gender in ascending order of name*/
    public Set<Patient> getAllPatientsByGender(char gender) {
        Set<Patient> patientSet = new HashSet();
        for (Patient patient : patients) {
            if (patient.getGender() == gender) {
                patientSet.add(patient);
            }
        }
        return patientSet; 
    }
}