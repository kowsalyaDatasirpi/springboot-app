FROM tomcat:9.0-alpine

ARG DEMO_WAR_PATH="build/libs/"
ADD $DEMO_WAR_PATH/demo.war /usr/local/tomcat/webapps/
CMD chmod +x /usr/local/tomcat/bin/catalina.sh

EXPOSE 8088
CMD ["catalina.sh", "run"]


