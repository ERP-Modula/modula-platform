FROM openjdk:21-jdk-slim

WORKDIR /app
COPY . .

RUN chmod +x gradlew
RUN ./gradlew modules:modula-platform:clean modules:modula-platform:build -x test

EXPOSE 8080

CMD ["java", "-jar", "modules/modula-platform/build/libs/modula-platform.jar"]
