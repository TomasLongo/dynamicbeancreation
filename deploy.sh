# Deploy .war file to widlfly
mvn package && cp ./target/dbc.war $WILDFLY_HOME/deployments
