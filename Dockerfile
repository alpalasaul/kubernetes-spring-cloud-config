FROM openjdk:11
RUN mkdir -p app/newrelic
# copiar el archivo jar
ADD ./newrelic/newrelic.jar app/newrelic
# copiar el archivo de configuraciones de newrelic
ADD ./newrelic/newrelic.yml app/newrelic
COPY ./build/libs/new-relic-config-0.0.1-SNAPSHOT.jar app
#CMD ["java","-jar","app/new-relic-config-0.0.1-SNAPSHOT.jar"]
CMD ["java","-javaagent:./app/newrelic/newrelic.jar" ,"-jar","app/new-relic-config-0.0.1-SNAPSHOT.jar"]