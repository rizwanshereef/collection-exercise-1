package com.stackroute;

import java.util.HashSet;
import java.util.Set;
/*Main class to test the program*/
public class TestPatient {
    public static void main(String[] args) {
        Set<Patient> patients = new HashSet();
/*Create object*/
        PatientService service = new PatientService();
        service.addPatient(1, "Sagar", 'M');
        service.addPatient(2, "Niharika", 'F');
        service.addPatient(3, "Pratyush", 'M');
/*Display details of patients with Gender M*/
        patients = service.getAllPatientsByGender('M');
        System.out.println("\n"+patients);
/*Check if there exist any patient with given registration number*/
        service.searchPatient(2);
    }
}
