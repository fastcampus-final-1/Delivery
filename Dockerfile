FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/delivery.jar /app

EXPOSE 8080

CMD ["java", "-jar", "delivery.jar"]