FROM rockylinux:8 

RUN dnf install -y maven
RUN mvn -version

COPY . .

RUN mvn clean package

CMD ["java", "-jar", "target/api-ip-application-0.0.1-SNAPSHOT.jar"]
