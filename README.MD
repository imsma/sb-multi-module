# Spring Boot Multi-Module Project

This is a multi-module project using Spring Boot. It demonstrates how to structure a Spring Boot application with multiple modules.

## Project Structure

```
sb-multi-module
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .mvn
│   └── wrapper
│       └── maven-wrapper.properties
│
├── application
│   └── src
│       └── main
│           └── java
│           └── resources
│       └── test
│           └── java
│   └── pom.xml
│
├── library
│   └── src
│       └── main
│           └── java
│           └── resources
│       └── test
│           └── java
│   └── pom.xml
│
├── LICENSE
└── README.md
```

## Modules

### Parent

The parent module contains the common configuration for all sub-modules. It includes dependency management and plugin configuration.

### Module A

Module A is a Spring Boot application that provides specific functionality. It can depend on other modules or be a standalone application.

### Module B

Module B is another Spring Boot application or library that provides additional functionality. It can also depend on other modules or be standalone.

## Building the Project

To build the entire project, run the following command from the root directory:

```bash
mvn clean install
```

## Running the Application

To run a specific module, navigate to the module directory and use the following command:

```bash
mvn spring-boot:run
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

My Blog
[https://sma.im](https://sma.im)
