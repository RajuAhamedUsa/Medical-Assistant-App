package com.raju.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
public class Patient {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Id;
	String name;
	Long phone;
	String addres;
	String medication;
	String assignDoctor;
	String lastVisit;
	int age;
	
	public Patient() {
		super();
	}
	public Patient(int id, String name, Long phone, String addres, String medication, String assignDoctor,
			String lastVisit, int age) {
		super();
		Id = id;
		this.name = name;
		this.phone = phone;
		this.addres = addres;
		this.medication = medication;
		this.assignDoctor = assignDoctor;
		this.lastVisit = lastVisit;
		this.age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getAssignDoctor() {
		return assignDoctor;
	}
	public void setAssignDoctor(String assignDoctor) {
		this.assignDoctor = assignDoctor;
	}
	public String getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(String lastVisit) {
		this.lastVisit = lastVisit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", name=" + name + ", phone=" + phone + ", addres=" + addres + ", medication="
				+ medication + ", assignDoctor=" + assignDoctor + ", lastVisit=" + lastVisit + ", age=" + age + "]";
	}
	
	
	
}
