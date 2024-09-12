# Spring Actuator Lab

[loom-video-link](https://www.loom.com/share/705427e57b1846fcbc474b54ffc4e9b4)

## Introduction
This project demonstrates the use of Spring Actuator to monitor a Spring Boot application and includes:
- Default Actuator endpoints
- Custom Actuator endpoints
- Security configuration for sensitive endpoints
- Prometheus integration

## Endpoints
- `/actuator/health`: Provides application health information.
- `/actuator/metrics`: Displays application and system metrics.
- `/actuator/info`: Displays general application info.
- `/actuator/env`: Displays system properties and environment variables.
- `/actuator/beans`: Lists all the Spring beans loaded in the application’s context.
- `/actuator/appstatus`: Custom endpoint showing application status.
- `/actuator/prometheus`: Exposes metrics in Prometheus format.

## Setup
1. Clone the repository.
2. Run the application using Maven or your IDE.
3. Access the endpoints as described above.

## Security
The application uses basic authentication to protect Actuator endpoints. Use the following credentials:
- Username: `admin`
- Password: `adminpassword`
