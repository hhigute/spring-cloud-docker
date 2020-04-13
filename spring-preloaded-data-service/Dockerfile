FROM java:8
EXPOSE 8000
ADD /target/spring-preloaded-data-service-0.0.1-SNAPSHOT.jar spring-preloaded-data-service.jar
ENTRYPOINT ["java", "-jar", "spring-preloaded-data-service.jar"]

#docker build -f Dockerfile -t spring-preloaded-data-service:v1 .