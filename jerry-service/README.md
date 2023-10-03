# Jerry Service - Spring Boot Microservice

Welcome to the Jerry Service repository! This project is a Spring Boot microservice that can be used as part of a larger microservices-based application. It is designed to interact with other microservices through Eureka Server for service discovery.

## Project Overview

### Dependencies

This project utilizes several dependencies to simplify development:

- **Spring Boot**: A robust framework for building Java-based applications.
- **Spring Cloud Netflix Eureka Client**: Integrates the service with Eureka Server, enabling service registration and discovery.
- **Spring Boot Starter Web**: Provides the essentials for building web applications.
- **Spring Boot DevTools**: Enhances the development experience with automatic application restarts and other developer tools.
- **Spring Boot Starter Test**: Contains testing tools and libraries for unit and integration testing.

### Java Version

This project is developed using Java 11.

### Spring Cloud Version

The Spring Cloud version used in this project is 2021.0.8.

## Getting Started

### Prerequisites

Before you begin, ensure that you have the following prerequisites installed:

- **Java 11**: Make sure you have Java 11 installed on your system.
- **Maven**: Ensure that you have Apache Maven installed.

### Building and Running the Service

To build the project, execute the following command in the project root directory:

```shell
mvn clean install
```

To run the Jerry Service, use the following command:

```shell
mvn spring-boot:run
```

The service will start and register with the Eureka Server if configured correctly.

### Accessing the Service

Once the service is running, you can access its endpoints by navigating to the appropriate URLs. The service's endpoints will be available at the base URL where it is registered with Eureka Server.

### Eureka Client Configuration

Ensure that you have configured the Eureka Server details in your `application.properties` or `application.yml` file to enable service registration and discovery.

```yaml
eureka:
  client:
    service-url:
      defaultZone: http://eureka-server-host:port/eureka/
```

## Contributing

We welcome contributions to this project! If you would like to contribute, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with clear, concise commit messages.
4. Push your changes to your fork.
5. Create a pull request to merge your changes into the main repository.

## License

This project is licensed under the MIT License. For details, please refer to the [LICENSE](LICENSE) file.
