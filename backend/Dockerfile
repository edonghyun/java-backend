FROM gradle:6.8.3-jdk11

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY start.sh .
COPY src src

EXPOSE 8080

CMD ["/bin/bash", "start.sh"]
