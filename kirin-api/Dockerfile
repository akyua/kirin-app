FROM maven:3.9.4-eclipse-temurin-17 AS backend-build
WORKDIR /kirin-api

COPY ./pom.xml .
RUN mvn dependency:resolve

COPY ./src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app

COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

COPY --from=backend-build /kirin-api/target/*.jar /app/app.jar

EXPOSE 8080
CMD ["/wait-for-it.sh", "db:3306", "--", "java", "-jar", "app.jar"]
