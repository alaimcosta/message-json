FROM maven:3.8.5-openjdk-17-slim AS build

WORKDIR /projectJson
COPY . .
RUN mvn clean install -DskipTests

CMD mvn spring-boot:run

#FROM maven:3.8.1-openjdk-17-slim AS build
#COPY /src /app/src
#COPY /pom.xml /app
#
#RUN mvn -f /app/pom.xml clean package
#
#FROM openjdk:17-jdk-alpine
#EXPOSE 8080
#COPY --from=build /app/target/*.jar app.jar
#
#ENTRYPOINT [ "java", "-jar", "/app.jar" ]
