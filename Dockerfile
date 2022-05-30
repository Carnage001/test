FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY target/Crop-Tracking.jar backend.jar
ENV MYSQL_HOST=localhost
ENV MYSQL_DATABASE=croptracking
ENV DB_USER=me
ENV DB_PASS=Mysql_21
ENV MYSQL_PORT=32356
EXPOSE 8082
CMD ["java","-jar","/backend.jar"]