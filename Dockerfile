FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift:1.5

COPY *.jar /deployments
COPY sb-process-server.xml /deployments/sb-process-server.xml

COPY m2/settings.xml /home/jboss/.m2/settings.xml
COPY m2/repository/ /home/jboss/.m2/repository/

#RUN chown -R jboss:jboss /home/jboss/.m2
USER root
RUN whoami
RUN find /home/jboss/.m2/repository -type d -exec chmod 775 {} +
RUN find /home/jboss/.m2/repository -type f -exec chmod 664 {} +
USER jboss
RUN whoami

