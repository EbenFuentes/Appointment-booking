package com.eben.apps.booking_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.eben.apps.booking_app.model.Appointment;

public interface ServiceRepository extends CrudRepository<Appointment, Integer> {

}
