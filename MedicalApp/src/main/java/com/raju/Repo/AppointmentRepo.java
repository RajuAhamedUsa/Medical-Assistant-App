package com.raju.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.raju.Model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
	
	@Query(value = "SELECT * FROM appointment where patient_id=?1", nativeQuery = true)
	List<Appointment> getAllAppointmentList(int pId);

}
