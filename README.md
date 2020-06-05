# f4h-portal-backend

Backend services for the web user interface for the project [FAIR4Health](https://www.fair4health.eu/).

## How to deploy

This is a maven Java project, check the [command line arguments and phases](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html#running-maven-tools).

### Build

Run `mvn clean package` to build the project.

### Development server

Run `mvn jetty:run` for a dev server. Navigate to `http://localhost:8080/` or the port stated in the application properties.

### Running unit tests

Run `mvn test`

### Running integration tests

Run `ng integration-test` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
