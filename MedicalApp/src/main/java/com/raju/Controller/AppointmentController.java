package com.raju.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raju.Model.Appointment;
import com.raju.Service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	 @Autowired
	 AppointmentService service;
	 
	 // Add appointment to existing patient
	 
	 @PostMapping("/addAppointment")
	 public String addAppointment(@RequestBody Appointment appointment)
	 {
		 return service.addAppointment(appointment);
	 }
	 
	 // Edit an appointment 
	 
	 @PutMapping("/editAppointment")
	 public String editAppointment(@RequestBody Appointment appointment)
	 {
		 
		 return service.editAppointment(appointment);
		 
	 }
	 
	 // Delete an appointment 
	 @DeleteMapping("/delete/{id}")
	 public String deleteAppointment(@PathVariable(value = "id") int id)
	 {
		 return service.deleteAppointment(id);
	 }
	 
	 // Get all appointment list based in patient
	 
	 @GetMapping("/getAllAppointment")
	 public List<Appointment> getAppointment(@RequestParam(value = "id") int id)
	 {
		 return service.getAllAppointmentList(id);
	 }
}
