package com.bank.onlinebanking.service;

import java.util.List;

import com.bank.onlinebanking.entity.Appointment;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 
 

 * Date: 09/08/18
 * Time: 04.33
 * To change this template use File | Settings | File Templates.
 */
public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}