# Example Maven Project

This is an example of a Maven project.

## Generate

Convert to an Eclipse project: 

    >> mvn eclipse:eclipse

## Build

Build (and test) this project: 

    >> mvn install
    
Skip tests by adding the `-DskipTests` flag when installing or by setting the `${skipTests}` property in the *POM.xml* file to `true`.

## Package

Package project into a local Maven dependency:

    >> mvn package

## Run

Execute the jar from the command line:

    >> java -jar target\ExampleMavenProject-0.0.1-SNAPSHOT-jar-with-dependencies.jar

Execute the jar from the command with the fully-qualified classpath.

**Note:** This jar is light-weight and depends on the *lib/* folder. So if the jar should be moved or zipped-up, the lib folder should be moved to the new location as well.

    >> java -cp target\ExampleMavenProject-0.0.1-SNAPSHOT.jar com.example.app.App {...}