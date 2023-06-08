FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/itemsDatabase.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","/app.jar"]