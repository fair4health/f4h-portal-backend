# f4h-portal-backend

[![Build Status](https://travis-ci.org/fair4health/f4h-portal-backend.svg?branch=master)](https://travis-ci.org/fair4health/f4h-portal-backend) 
[![codecov.io](https://codecov.io/gh/fair4health/f4h-portal-backend/branch/master/graphs/badge.svg)](http://codecov.io/gh/fair4health/f4h-portal-backend)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=eu.fair4health:f4h-portal-backend&metric=alert_status)](https://sonarcloud.io/dashboard/index/eu.fair4health:f4h-portal-backend)
[![Docker Build](https://img.shields.io/docker/cloud/build/fair4health/f4h-portal-backend)](https://cloud.docker.com/u/ccavero/repository/docker/fair4health/f4h-portal-backend)
[![Docker Pulls](https://img.shields.io/docker/pulls/fair4health/f4h-portal-backend)](https://cloud.docker.com/u/ccavero/repository/docker/fair4health/f4h-portal-backend)
[![License](https://img.shields.io/badge/License-Apache%202.0-green.svg)](https://opensource.org/licenses/Apache-2.0)

## Description

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
