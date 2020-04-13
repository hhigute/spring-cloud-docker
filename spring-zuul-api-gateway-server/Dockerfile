FROM java:8
EXPOSE 8765
ADD /target/spring-zuul-api-gateway-server-0.0.1-SNAPSHOT.jar spring-zuul-api-gateway-server.jar
ENTRYPOINT ["java", "-jar", "spring-zuul-api-gateway-server.jar"]