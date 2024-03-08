FROM openjdk:17-alpine
ENV APP_HOME=hibernate-relations
ENV ARTIFACT_NAME=hibernate-relations-0.0.1-SNAPSHOT.jar
WORKDIR $APP_HOME
COPY build/libs/$ARTIFACT_NAME app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080
