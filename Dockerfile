FROM eclipse-temurin:17-jdk-jammy as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN chmod +x gradlew
RUN ./gradlew --version
RUN ./gradlew bootJar
RUN echo $JAVA_HOME
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /usr/app/build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

 


# Set a non-root user
USER 10014
EXPOSE 8080
ENTRYPOINT java -jar /app/demo-0.0.1-SNAPSHOT.jar
