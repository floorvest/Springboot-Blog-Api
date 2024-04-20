FROM openjdk:17-jdk-alpine
COPY target/springboot-blog-rest-api-0.0.1-SNAPSHOT.jar blog-api-0.0.1.jar
ENTRYPOINT ["java","-jar","/blog-api-0.0.1.jar"]