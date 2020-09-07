package com.stackroute;

import java.util.*;

public class PatientService {
    Set<Patient> patientSet = new HashSet<>();
/*Method to add the patient details to set*/
    public void addPatient(int registrationNumber, String name, char gender) {
        Patient patientOne = new Patient();
        patientOne.setRegistrationNumber(registrationNumber);
        patientOne.setName(name);
        patientOne.setGender(gender);
        patientSet.add(patientOne);
    }
/*Method to search the patient with registration number*/
    public void searchPatient(int registrationNumber) {
        for (Patient patient : patientSet) {
            if (patient.getRegistrationNumber() == registrationNumber) {
                System.out.println(patient);
            } else {
                System.out.println("Patient not found");
            }
        }
    }
/*Method to return list of sorted patient details of given gender*/
    public Set<Patient> getAllPatientsByGender(char gender) {
        Set<Patient> patientSort = new TreeSet<>();
        for (Patient patient : patientSet) {
            if (patient.getGender() == gender) {
                patientSort.add(patient);
            }
        }
        return patientSort; // returning result
    }

}