# Spring Boot Microservice Project with Eureka and Zuul

This microservice project showcases a simple architecture with Eureka, Zuul, and two simple microservices named "Tom" and "Jerry." The project demonstrates service discovery, API routing, and communication between microservices.

## Table of Contents

- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Project Structure

The project is organized into the following components:

- **Eureka Server**: This acts as the service registry and discovery server. It runs on port 8761.

- **Zuul**: This serves as an API gateway for routing requests to the appropriate microservices. It runs on port 8762.

- **Tom Microservice**: A simple microservice named "Tom" running on port 8100.

- **Jerry Microservice**: Another simple microservice named "Jerry" running on port 8200.

## Prerequisites

Before you begin, ensure you have the following prerequisites:

- **Java Development Kit (JDK)**: You need JDK 11 or higher installed.
- **Maven**: Make sure you have Apache Maven installed.
- **Docker (optional)**: If you want to containerize your services, you can install Docker.

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/microservice-project.git
   ```

2. Navigate to the project directory:

   ```bash
   cd microservice-project
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Start the services in the following order:

   - Start the Eureka Server on port 8761:
   
     ```bash
     java -jar eureka-server/target/eureka-server-1.0.0.jar
     ```

   - Start the Zuul Server on port 8762:

     ```bash
     java -jar zuul-server/target/zuul-server-1.0.0.jar
     ```

   - Start the "Tom" Microservice on port 8100:

     ```bash
     java -jar tom-microservice/target/tom-microservice-1.0.0.jar
     ```

   - Start the "Jerry" Microservice on port 8200:

     ```bash
     java -jar jerry-microservice/target/jerry-microservice-1.0.0.jar
     ```

## Configuration

- **Eureka Server Configuration**: You can modify the Eureka Server configuration in the `eureka-server/src/main/resources/application.properties` file.

- **Zuul Server Configuration**: Customize the Zuul Server configuration in the `zuul-server/src/main/resources/application.properties` file.

- **Microservice Configuration**: Adjust the individual microservices' configurations in their respective `application.properties` files located in the `tom-microservice` and `jerry-microservice` directories.

## Usage

Once the services are up and running, you can access the microservices through the Zuul Gateway using the specified API endpoints.

## API Endpoints

- **Tom Microservice**:
  - Base URL: `http://localhost:8762/tom`

- **Jerry Microservice**:
  - Base URL: `http://localhost:8762/jerry`

## Dependencies

The project uses Spring Boot and Spring Cloud for microservice development and orchestration. The specific dependencies can be found in the individual microservice `pom.xml` files.

## Contributing

Contributions to this project are welcome. Feel free to fork the repository and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
