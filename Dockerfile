#FROM maven:3.8.1-openjdk-17-slim AS build

#WORKDIR /projectJson
#COPY . .


#CMD mvn spring-boot:run

#COPY /src /app/src
#COPY /pom.xml /app
#RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-alpine
EXPOSE 8080
#COPY --from=build /app/target/*.jar app.jar
COPY target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
