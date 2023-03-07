FROM  amazoncorretto:11-alpine-jdk
MAINTAINER carosalanova
COPY target/backportfcsalanova-0.0.1-SNAPSHOT.jar  backportfcsalanova-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backportfcsalanova-0.0.1-SNAPSHOT.jar"]
