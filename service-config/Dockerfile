FROM openjdk:11.0.7
ADD target/service-config*.jar service-config.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar" , "service-config.jar","run"]