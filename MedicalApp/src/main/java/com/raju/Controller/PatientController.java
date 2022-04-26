package com.raju.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.Model.Patient;
import com.raju.Service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	PatientService service;
	//This method call service class to get all patient list
	@GetMapping("/getAllPatient")
	public List<Patient> getAllPatient() {
		
		List<Patient> list = new ArrayList<Patient>();
		list = service.getAllPatient();		

		return list;
	}
	
	//This method call service to edit existing patient 
	@PutMapping("/editPatient")
	public String editPatient(@RequestBody Patient patient)
	{
		return service.editPatient(patient);
		
	}
	// This method call service to add new patient to DB
	@PostMapping("/addPatient")
	public String addPatient(@RequestBody Patient patient)
	{
		return service.addPatient(patient);
	}
	
	//This method all service to delete existing patient by ID
	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable(value = "id") int id)
	{
		return service.deletePatient(id);
	}
	
	 @GetMapping("/test")
	 public String test()
	 {
		 System.out.println("OK");
		 return "OK  Done ";
	 }
	
	
	
}
