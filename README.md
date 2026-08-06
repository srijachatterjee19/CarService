# CarService Application

A Spring Boot MVC web application for car service registration. Service providers can register a car's details, and the data is saved in memory via a repository layer.

## Features

- Register a car for service by entering its details through a web form
- Input validation: all fields must be filled before the record is saved
- MVC architecture with clearly separated Controller, Service, and Repository layers
- JSP views with Spring form binding

## Tech Stack

- Java 17
- Spring Boot 3.0.0
- Spring MVC (JSP / JSTL views)
- Embedded Tomcat
- Maven

## Running the App

```bash
mvn spring-boot:run
```

Then open [http://localhost:8080/welcome](http://localhost:8080/welcome).

## Endpoints

| Method | Path        | Description                                        |
| ------ | ----------- | -------------------------------------------------- |
| GET    | `/welcome`  | Landing page                                       |
| GET    | `/register` | Show car registration form                         |
| POST   | `/done`     | Submit form — redirects to success or back to form |

## Registration Form Fields

| Field                       | Description                      |
| --------------------------- | -------------------------------- |
| Car Registration Number     | Unique plate/registration number |
| Owner / Car Name            | Owner name or car model          |
| Warranty Coverage / Remarks | Notes or warranty status         |
| Work to be Done             | Service tasks requested          |

## How It Works

1. Service provider visits `/register` and fills in the form.
2. On submit, `RegisterController` validates that all fields are non-empty.
3. If valid, `CarRegistrationService.registerCar()` calls `Car.createVehicle()` to populate the domain object, then `Car.saveVehicleDetails()` to persist it via `CarDAO`.
4. `CarDAO.save()` appends the car to an in-memory list and returns the list size as the generated `CarId`.
5. The controller returns the `success` view on success, or `carregister` to re-display the form on validation failure.
