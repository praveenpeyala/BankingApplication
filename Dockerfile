FROM eclipse-temurin:17-jdk-alpine
MAINTAINER "Arjun DevOps World"
VOLUME /tmp
COPY target/*.jar BankingApplication.jar
ENTRYPOINT ["java","-jar","/BankingApplication.jar"]
