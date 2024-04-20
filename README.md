# Springboot Blog Api

To build, can run **mvn package**. once the jar ready, can build the docker image using

`docker build --tag=blog-api:latest .`

and once build is done can run using:

`docker run -p8080:8080 blog-api:latest`