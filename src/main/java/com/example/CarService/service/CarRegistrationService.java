package com.example.CarService.service;

import com.example.CarService.domain.Registration;
import com.example.CarService.domain.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRegistrationService implements Registration {

    @Autowired
    Vehicle car;

    @Override
    public int registerCar(String vehicleNo, String vehicleName, String CarDetails, String CarWork) {
        car.createVehicle(vehicleNo, vehicleName, CarDetails, CarWork);
        return car.saveVehicleDetails();
    }

    @Override
    public Vehicle getNewCar() {
        return car;
    }
}
