FROM java
RUN mkdir -p /test/jenkins/docker
WORKDIR /test/jenkins/docker
COPY jenkins-docker.jar  jenkins-docker.jar
ENTRYPOINT ["java","-jar","/test/jenkins/docker/jenkins-docker.jar"]