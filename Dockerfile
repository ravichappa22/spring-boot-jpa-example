FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift
# Comment
RUN echo 'Image pull complete'
ENV maindir /opt
WORKDIR ${maindir}
COPY ./*.jar ${maindir}
EXPOSE 8080
CMD ["java -jar","*.jar"]
