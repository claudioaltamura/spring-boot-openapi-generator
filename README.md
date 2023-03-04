[![Build Status](https://travis-ci.org/claudioaltamura/spring-boot-openapi-generator.svg?branch=master)](https://travis-ci.org/claudioaltamura/spring-boot-openapi-generator)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# spring-boot-openapi-generator
Spring Boot OpenAPI generator example

## Attention

OpenAPI spec must be named openapi.yml.

## Generate
./mvnw clean compile

regenerating
delete the file under the folder .openapi-generator

## Run
./mvnw spring-boot:run

## Example

    curl http://localhost:8080/pets

## OpenAPI

    http://localhost:8080/webjars/swagger-ui/index.html

### Development

for demo purposes I configured in pom.xml

    <interfaceOnly>false</interfaceOnly>

The stubs generated can be used in your existing Spring-MVC or Spring-Boot application to create controller endpoints
by adding ```@Controller``` classes that implement the interface. Eg:
```java
@Controller
public class PetController implements PetApi {
// implement all PetApi methods
}
```