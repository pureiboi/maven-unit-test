# Maven Unit Test

## Execution in local machine

```shell
mvn clean test
docker run -it -v $PWD:/tmp/build/maven-unit-test haynes/jacoco2cobertura:latest sh /tmp/build/maven-unit-test/jacoco2cobertura.sh
```

### Review generated cobertura.xml
