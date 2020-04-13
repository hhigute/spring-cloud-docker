FROM java:8
EXPOSE 8761
ADD /target/spring-cloud-registry-eureka-server-0.0.1-SNAPSHOT.jar spring-cloud-registry-eureka-server.jar
ENTRYPOINT ["java", "-jar", "spring-cloud-registry-eureka-server.jar"]