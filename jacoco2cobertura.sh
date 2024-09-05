#!/bin/sh

# run in container haynes/jacoco2cobertura
# docker run -it -v $PWD:/tmp/build/maven-unit-test haynes/jacoco2cobertura:latest sh /tmp/build/maven-unit-test/jacoco2cobertura.sh
export JACOC0_XML="target/site/jacoco/jacoco.xml"
export CI_PROJECT_DIR="/tmp/build/maven-unit-test"

cd $CI_PROJECT_DIR

java_src=$(find $(pwd) -type d -regex ".*src/main/kotlin" -exec echo {} \;)

python /opt/cover2cover.py target/site/jacoco/jacoco.xml ${java_src} > cobertura.xml
