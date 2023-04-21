# Overview

## Console Application

### Run & Test Locally

```bash
$ cd console/console-ip-application
$ mvn clean package
$ java -jar target/console-ip-application-1.0-SNAPSHOT.jar
```

### Run in Docker and Test

```bash
$ cd console/console-ip-application
$ docker build -t console-ip:latest .
$ docker run console-ip:latest
```

## API Application

### Run & Test Locally

```bash
$ cd api/api-ip-application
$ mvn clean package
$ java -jar target/api-ip-application-0.0.1-SNAPSHOT.jar
$ curl http://localhost:8080/api/ips
```

### Run in Docker and Test

```bash
$ cd api/api-ip-application
$ docker build -t api-ip:latest .
$ docker run -p 8080:8080 -d api-ip:latest
$ curl http://localhost:8080/api/ips
```

### Test with nginx loadbalancing backend apis

```bash
$ cd api/api-ip-application
$ docker-compose build
$ docker-compose up -d
$ curl http://localhost/api/ips
```