FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift
# Comment
RUN echo 'Image pull complete'
ENV maindir /opt
#WORKDIR ${maindir}
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} /opt/app.jar
ENTRYPOINT ["/usr/lib/jvm/java-1.8.0-openjdk/bin/java","-jar","/opt/app.jar"]
EXPOSE 8080
