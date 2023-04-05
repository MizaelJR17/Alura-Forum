FROM openjdk
WORKDIR /src
EXPOSE 8080
ADD target/forum-0.0.1-SNAPSHOT.jar yi.jar
ENTRYPOINT ["java","-jar", "forum.jar"]