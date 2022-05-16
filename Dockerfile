#docker
FROM openjdk:11
LABEL maintainer="audit-severity-main.net"
ADD target/severity-0.0.1-SNAPSHOT.jar audit-severity-main.jar
ENTRYPOINT ["java","-jar","audit-severity-main.jar"]


