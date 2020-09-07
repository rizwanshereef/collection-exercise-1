package com.stackroute;

public class Patient {
    int registrationNumber;
    String name;
    char gender;
/*Creating constructor*/
    public Patient(int registrationNumber, String name, char gender) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.gender = gender;
    }
/*Default constructor*/
    public Patient() {
    }
/*Getter and Setter*/
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
