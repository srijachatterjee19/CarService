package com.example.CarService.domain;

public interface Registration {

    /**
     * Method registerCar uses createVehicle method for creating a vehicle and based
     * on saveVehicleDetails method it returns true or false.
     **/
    public int registerCar(String vehicleNo, String vehicleName, String CarDetails, String CarWork);

    /**
     * It simply returns a car of type Vehicle (please refer CarRegistrationService
     * for further explanation).
     **/
    public Vehicle getNewCar();
}
