FROM openjdk:17-alpine
COPY ./build/libs/eureka-service-0.0.1-SNAPSHOT.jar /eureka.jar
EXPOSE  8761:8761
CMD ["java","-jar","/eureka.jar"]