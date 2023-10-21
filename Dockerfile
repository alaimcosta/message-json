FROM maven:3.8.1-openjdk-17-slim AS build

WORKDIR /app
COPY . /app
RUN mvn clean install -DskipTests

# Estágio 2: Criando a imagem Docker com o JAR compilado
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar" ]
