FROM java:8-jdk-alpine
COPY ./target/sampleTest1-0.0.1-SNAPSHOT.war /usr/app/
WORKDIR /usr/app
ENTRYPOINT [“java”,”-jar”,”sampleTest1-0.0.1-SNAPSHOT.war”]
