
  
# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy fat WAR
COPY sampleTest1-0.0.1-SNAPSHOT.war /home/sampleTest1-0.0.1-SNAPSHOT.war
# runs application
CMD ["java", "-jar", "/home/sampleTest1-0.0.1-SNAPSHOT.war"]
