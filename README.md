# backstage-demo-app

This is a demo application to show how an application can be integrated in backstage. The application is written in Java with Spring boot framework and maven as build system.

## Development

To run the application for development run the following command.

```bash
mvn spring-boot:run
```

## Build
To build the image locally run the following command.

```bash
./tasks build
```

## Run the container

To run the built container run the following command.

```bash
./tasks run
```

## Integration with backstage

To register this application in backstage, catalog-info.yaml file is added in the root directory.
