package com.poc.healthCare.service;

import java.util.List;
import com.poc.healthCare.entity.Admin;
import com.poc.healthCare.entity.User;

public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);
	
}
