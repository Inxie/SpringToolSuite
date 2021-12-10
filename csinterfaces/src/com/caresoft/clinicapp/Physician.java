package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser{
	// Inside class:    
    private ArrayList<String> patientNotes;

	// Constructor that takes an ID
    public Physician(int id) {
		this.id=id;
	}
    
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPIN(int pin) {
    	if (this.pin > 999 && this.pin <= 9999) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean accessAuthorized(Integer id) {
    	if (this.id == id) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
    // TO DO: Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
}
