FROM rockylinux:8 

RUN dnf install -y java-11-openjdk maven

COPY . .

RUN mvn clean package

CMD ["java", "-jar", "target/console-ip-application-1.0-SNAPSHOT.jar"]
