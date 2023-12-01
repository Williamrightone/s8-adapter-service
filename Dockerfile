FROM openjdk:17-alpine
COPY ./target/*.jar adapter-service.jar
RUN sh -c 'touch adapter-service.jar'
EXPOSE 8093
ENTRYPOINT ["java","-jar","adapter-service.jar"]