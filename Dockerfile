FROM openjdk

LABEL authors="Prasanna"


ADD target/phase4-project.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

