package com.eben.apps.booking_app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eben.apps.booking_app.repository.AppointmentRepository;
import com.eben.apps.booking_app.repository.ServiceRepository;

public class AppointmentController {
	
	private final AppointmentRepository AptRepo;
	private final ServiceRepository ServiceRepo;
	
	public AppointmentController(AppointmentRepository AptRepo, ServiceRepository ServiceRepo) {
		this.AptRepo = AptRepo;
		this.ServiceRepo = ServiceRepo;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		return "indeX";
	}
}
