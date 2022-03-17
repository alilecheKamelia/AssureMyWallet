FROM openjdk:11 as build
LABEL maintainer="author@javatodev.com"
VOLUME /main-app
COPY  target/asssurWallet-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8099
ENTRYPOINT ["java", "-jar","/app.jar"]
