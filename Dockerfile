from amazoncorretto:21-alpine-jdk

WORKDIR /app

COPY $GITHUB_WORKSPACE/target/ci-demo-0.0.1.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]