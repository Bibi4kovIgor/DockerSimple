#FROM openjdk:16-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

RUN mkdir -p /apps
COPY ./${JAR_FILE} /apps/app.jar
COPY ./entrypoint.sh /apps/entrypoint.sh

RUN chmod +x /apps/entrypoint.sh
CMD ["/apps/entrypoint.sh"]
