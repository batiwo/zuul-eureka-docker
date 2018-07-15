# Suul Eureka Docker

The purpose of this project is to present a full example of docker deployement with 2 Rest Api and Zuul as proxy and Eureka as "DNS".

## Usage without docker
1. Clone the repository `git clone https://github.com/batiwo/zuul-eureka-docker.git` 
2. Build the `zuul-eureka-docker` project with `mvn install`
3. Run all submodules JAR with `java -jar xxx.jar` (in the following order `eureka-server`, `zuul-server`, `rest1-server`, `rest2-server`)
4. Go to [http://localhost:8761/](http://localhost:8761/) for eureka dashboard.
5. Try [http://localhost:8762/rest1/admin/page1](http://localhost:8762/rest1/admin/page1) to access rest1 api from zuul proxy
6. Try [http://localhost:8762/rest2/download/page1](http://localhost:8762/rest2/download/page1) to access rest2 api from zuul proxy

## Usage with docker-compose
1. Clone the repository `git clone https://github.com/batiwo/zuul-eureka-docker.git` 
2. Build the `zuul-eureka-docker` project with `mvn install`
3. Run `docker-compose up`
4. Go to [http://localhost:8761/](http://localhost:8761/) for eureka dashboard.
5. Try [http://localhost:8762/rest1/admin/page1](http://localhost:8762/rest1/admin/page1) to access rest1 api from zuul proxy
6. Try [http://localhost:8762/rest2/download/page1](http://localhost:8762/rest2/download/page1) to access rest2 api from zuul proxy

## Contributor
[Sébastien DRUJONT](https://github.com/batiwo)
