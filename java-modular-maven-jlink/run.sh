JAVA_HOME="c:\\Program Files\\Java\\jdk-10\\" mvn clean install
cd elon
JAVA_HOME="c:\\Program Files\\Java\\jdk-10\\" mvn exec:exec
echo "Executing runtime image"
../runtime-image/target/maven-jlink/bin/java user.elon.Elon