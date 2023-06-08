FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/Customer.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app.jar"]