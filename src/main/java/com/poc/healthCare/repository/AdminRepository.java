package com.poc.healthCare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.healthCare.entity.Admin;
import com.poc.healthCare.entity.User;


@Repository("adminRepository")
public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByEmail(String user);
	
	List<Admin> findByRole(String user);
}