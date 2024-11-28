# Configuration Templates

This directory contains configuration templates for various tools.

## SonarQube

This template contains a docker-compose file to run SonarQube with a PostgreSQL database.
SonarQube is a tool that analyzes code quality and security. More information can be found [here](https://www.sonarqube.org/).
The provided template is configured to use PostgreSQL as the database to store the code analysis results and persist them.
The sonarqube server is exposed on port 9000 and accessible at `http://localhost:9000` (or the IP address of the machine running the container).

### Prerequisites

- Docker
- Docker Compose
### Running the container

To run the container, navigate to the `configuration_templates` directory and run `docker compose -f sonarqube-compose.yml up`.
