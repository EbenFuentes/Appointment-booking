package com.eben.apps.booking_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.eben.apps.booking_app.model.Service;

public interface AppointmentRepository extends CrudRepository<Service, Integer>{

}
