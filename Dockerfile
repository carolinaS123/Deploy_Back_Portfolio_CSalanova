FROM  amazoncorretto:8-alpine-jdk
MAINTAINER carosalanova
COPY target/backportfcsalanova-0.0.1-SNAPSHOT.jar  backportfcsalanova-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backportfcsalanova-0.0.1-SNAPSHOT.jar"]
