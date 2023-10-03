# Eureka Server - Spring Boot Microservice Registry

This repository contains a Spring Boot project for a Eureka Server, which serves as a microservices registry in a Spring Cloud-based application ecosystem. Eureka Server allows other microservices to register with it, making it easier for them to discover and communicate with each other.

## Project Overview

### Dependencies

This project uses the following dependencies:

- **Spring Boot**: Provides a powerful and flexible framework for building Java-based applications.
- **Spring Cloud Netflix Eureka Server**: Integrates Eureka Server into the Spring Cloud ecosystem.
- **Spring Boot DevTools**: Enhances the development experience by providing automatic application restarts and other developer tools.
- **Spring Boot Starter Web**: Includes everything needed to build a web-based application.
- **Spring Boot Starter Test**: Contains testing tools and libraries for unit and integration testing.

### Java Version

This project is built with Java 11.

### Spring Cloud Version

It uses Spring Cloud version 2021.0.8 for managing cloud-related dependencies.

## Getting Started

### Prerequisites

- **Java 11**: Make sure you have Java 11 installed on your system.
- **Maven**: Ensure that you have Apache Maven installed.

### Building the Project

To build the project, execute the following command in the project root directory:

```shell
mvn clean install
```

### Running the Eureka Server

After building the project, you can run the Eureka Server using the following command:

```shell
mvn spring-boot:run
```

The Eureka Server will start at `http://localhost:8761/`.

### Eureka Server Dashboard

You can access the Eureka Server dashboard by navigating to [http://localhost:8761/](http://localhost:8761/) in your web browser. This dashboard provides information about registered microservices.

## Contributing

If you would like to contribute to this project, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with clear, concise commit messages.
4. Push your changes to your fork.
5. Create a pull request to merge your changes into the main repository.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
