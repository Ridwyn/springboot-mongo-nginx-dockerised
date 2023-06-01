FROM openjdk:17
ADD build/libs/SpringBootApp-0.0.1-SNAPSHOT.jar /home/SpringBootApp-0.0.1-SNAPSHOT.jar
ADD config/application.properties /home/config/application.properties
EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "/home/SpringBootService1-0.0.1-SNAPSHOT.jar"]