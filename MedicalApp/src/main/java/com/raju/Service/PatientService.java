package com.raju.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.Model.Patient;
import com.raju.Repo.PatientRepo;

@Service
public class PatientService {

	@Autowired
	PatientRepo patientRepo;
	//Get all patient list	
	public List<Patient> getAllPatient() {
			
			List<Patient> list= new ArrayList<>();
			list = patientRepo.findAll();
			return list;
			
		}
		
	//Add new patient to DB.
	public String addPatient(Patient patient)
	{
		this.patientRepo.save(patient);
		return "Added Successfully";
		
	}
	
	//Edit patient	
	public String editPatient(Patient patient)
	{
	   Patient exPatient = patientRepo.getById(patient.getId());//Get existing patient object
	   exPatient.setAddres(patient.getAddres());  // New Address
	   exPatient.setAssignDoctor(patient.getAssignDoctor()); // New Assign Doctor
	   exPatient.setName(patient.getName()); // New Name
	   exPatient.setPhone(patient.getPhone()); // New Phone Number
			   patientRepo.save(exPatient);
	   return "Edited successfully";
	   
	}
	//Delete patient by ID
	public String deletePatient(int id)
	{
		this.patientRepo.deleteById(id);
		return "Deleted successfully";
	}
	
	
	
}
