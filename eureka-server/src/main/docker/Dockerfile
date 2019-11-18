FROM openjdk:8-alpine
VOLUME "/var/eureka"

COPY /target/eureka-server-0.0.1-SNAPSHOT.jar /var/eureka/app.jar
RUN apk --no-cache add curl
RUN sh -c 'touch /var/eureka/app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /var/eureka/app.jar"]