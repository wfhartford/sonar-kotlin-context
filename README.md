# Kotlin Context Receivers Example

This small sample project uses Kotlin context receivers to demonstrate SonarQube's related functionality.

Build the project:
```shell
./gradlew build
```

Run the project:
```shell
./gradlew run
```

Run sonarqube analysis:
```shell
./gradlew sonar
```
This will require a local sonarqube installation, or one configured in `~/.gradle/gradle.properties` using the `systemProp.sonar.host.url` property.
