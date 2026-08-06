package com.example.CarService.Controller;

import com.example.CarService.domain.Car;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @Autowired
    Registration registration;

    @RequestMapping("/register")
    public String getRegistrationPage(Model model) {
        model.addAttribute("car", new Car());
        return "carregister";
    }

    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute Car car) {
        if (car.getRegisterationNumber() != null && !car.getRegisterationNumber().isEmpty()
                && car.getCarName() != null && !car.getCarName().isEmpty()
                && car.getCarDetails() != null && !car.getCarDetails().isEmpty()
                && car.getCarWork() != null && !car.getCarWork().isEmpty()) {
            registration.registerCar(
                    car.getRegisterationNumber(),
                    car.getCarName(),
                    car.getCarDetails(),
                    car.getCarWork()
            );
            return "success";
        } else {
            return "carregister";
        }
    }
}
