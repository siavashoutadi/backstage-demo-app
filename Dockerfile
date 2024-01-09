FROM maven:3-eclipse-temurin-17 as build

WORKDIR /app

COPY . /app

RUN mvn clean package

FROM gcr.io/distroless/java17-debian12

WORKDIR /app

COPY --from=build /app/target/backstage-demo*.jar /app/backstage-demo.jar

CMD ["/app/backstage-demo.jar"]
