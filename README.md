# BankingApplication
server.portnumber = 2510

Sonar Properties
---------------------------------------
sonar.host.url=http://3.109.199.80:9000/
sonar.projectKey=siri
sonar.projectName=siri
sonar.sourceEncoding=UTF-8
sonar.language=java
sonar.java.source=1.7
sonar.java.target=1.7
sonar.projectVersion=1.0
sonar.sources=src/main/java
sonar.java.binaries=.




FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
