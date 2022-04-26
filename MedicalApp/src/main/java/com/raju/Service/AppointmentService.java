package com.raju.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.Model.Appointment;
import com.raju.Repo.AppointmentRepo;

@Service
public class AppointmentService {
       
	@Autowired
	AppointmentRepo appointmentRepo;
	
	//Add appointment 
	
	public String addAppointment(Appointment appointment)
	{
		appointmentRepo.save(appointment);
		return "Appointment Added Scuccessfully";
	}
	
	//Edit Appointment
	
	public String editAppointment(Appointment appointment)
	{
		Appointment exAppointment =appointmentRepo.getById(appointment.getId());
		exAppointment.setAppointmentTime(appointment.getAppointmentTime());
		exAppointment.setLocation(appointment.getLocation());
		appointmentRepo.save(exAppointment);
		
		return "Appointment edited successfully";
	}
	
	// Get all appointment list
	
	 public List<Appointment> getAllAppointmentList(int id)
	 {
		 List<Appointment> lsitAppointments = new ArrayList<>();
		 lsitAppointments = appointmentRepo.getAllAppointmentList(id);
		 return lsitAppointments;
		 
	 }

	 //Delete a appointment
	 
	 public String deleteAppointment(int id)
	 {
		 appointmentRepo.deleteById(id);
		 return "Deleted a appointment successfully";
		 
	 }
}