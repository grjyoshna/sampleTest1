From tomcat
ADD sampleTest1-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080
sudo groupadd docker
sudo usermod -aG docker grjyoshna
