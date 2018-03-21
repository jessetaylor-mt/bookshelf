https://aws.amazon.com/getting-started/tutorials
https://aws.amazon.com/getting-started/tutorials/deploy-docker-containers/

https://spring.io/guides/gs/rest-service/
https://spring.io/guides/gs/spring-boot-docker/ [uber JAR]
http://www.littlebigextra.com/create-docker-image-spring-mvc-project/ [from WAR]

CREATE DOCKER IMAGE:
sudo docker build -t whale-app --build-arg JAR_FILE=./build/libs/tomdock-hello-whale-1.0.0.jar .
