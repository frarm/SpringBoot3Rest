FROM openjdk:17-slim
ADD target/*jar spring-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-demo.jar"]