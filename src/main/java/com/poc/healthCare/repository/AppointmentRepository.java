package com.poc.healthCare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.healthCare.entity.Appointment;
import com.poc.healthCare.entity.User;


@Repository("appointmentRepository")
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	
}