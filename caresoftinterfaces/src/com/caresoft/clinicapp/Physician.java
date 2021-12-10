package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	//... imports class definition...
	
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    public boolean assignPIN(int pin) {
    	if (pin != 4) {
        	return false;
    	}
    	else {
    		return true;
    	}
    }
    // TO DO: Implement HIPAACompliantUser!
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if (confirmedAuthID != id) {
        	return false;
    	}
    	else {
    		return true;
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
    // TO DO: Setters & Getters
    
}