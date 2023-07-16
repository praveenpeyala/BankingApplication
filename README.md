# BankingApplication

server.portnumber = 2510 <br />

Sonar Properties <br />
--------------------------------------- <br />
sonar.host.url=http://3.109.199.80:9000/ <br />
sonar.projectKey=siri <br />
sonar.projectName=siri <br />
sonar.sourceEncoding=UTF-8 <br />
sonar.language=java <br />
sonar.java.source=1.7 <br />
sonar.java.target=1.7 <br />
sonar.projectVersion=1.0 <br />
sonar.sources=src/main/java <br />
sonar.java.binaries=. <br />



-------------------------------------------DockerFile------------------------ <br />
FROM eclipse-temurin:17-jdk-alpine <br />
MAINTAINER "Arjun DevOps World"  <br />
VOLUME /tmp <br />
 COPY target/*.jar BankingApplication.jar <br />
ENTRYPOINT ["java","-jar","/BankingApplication.jar"]
