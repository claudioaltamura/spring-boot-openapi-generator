![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/claudioaltamura/spring-boot-openapi-generator/maven-build.yml?branch=main)

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

    http://localhost:8080/v3/api-docs

    http://localhost:8080/swagger-ui/index.html

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