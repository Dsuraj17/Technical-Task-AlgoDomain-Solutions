How to Run

1.Import project into eclipse
	•File -> Import -> Maven -> Existing Maven Projects -> Browse Project from      
	cloned location (task)

2.create a table in your database - algodomain

3.Change mysql username and password as per your installation
	•open src/main/resources/application.properties
	•change spring.datasource.username and spring.datasource.password 
	 as per your mysql installation

4.Build and run the app using maven
	•mvn package-
	 java -jar target/spring-boot-rest-api-tutorial-0.0.1-SNAPSHOT.jar
	•Alternatively, you can run the app without packaging it using -
	 mvn spring-boot:run
	•The app will start running at http://localhost:9090.
