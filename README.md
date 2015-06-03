# Example Maven Project

This is an example of a Maven project.

## Generate

Convert to an Eclipse project: 

    >> mvn eclipse:eclipse

## Build

Build (and test) this project: 

    >> mvn clean install
    
Skip tests by adding the `-DskipTests` flag when installing or by setting the `${skipTests}` property in the *POM.xml* file to `true`.

## Package

Package project into an executable jar:

    >> mvn package

## Run

Execute the jar from the command line:

    >> java -cp target\ExampleMavenProject-0.0.1-SNAPSHOT.jar com.example.app.App