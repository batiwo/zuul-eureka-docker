# Suul Eureka Docker

The purpose of this project is to present a full example of docker deployement with 2 Rest Api and Zuul as proxy and Eureka as "DNS".

#### Notice
The port for Zuul proxy has been set to 80 to hide the port in url and make it more convenient for WebDesigner using angular for example.

## Usage without docker
1. Clone the repository `git clone https://github.com/batiwo/zuul-eureka-docker.git` 
2. Build the `zuul-eureka-docker` project with `mvn install`
3. Run all submodules JAR with `java -jar xxx.jar` (in the following order `eureka-server`, `zuul-server`, `rest1-server`, `rest2-server`)
4. Go to [http://localhost:8761/](http://localhost:8761/) for eureka dashboard.
5. Access rest1 api [http://localhost/rest1/admin/page1](http://localhost/rest1/admin/page1) through Zuul proxy
6. Access rest2 api [http://localhost/rest2/download/page1](http://localhost/rest2/download/page1) through Zuul proxy
7. Access swagger-ui documentation for rest1 at [http://localhost/rest1/swagger-ui.html](http://localhost/rest1/swagger-ui.html) through Zuul proxy
8. Access swagger-ui documentation for rest2 at [http://localhost/rest2/swagger-ui.html](http://localhost/rest2/swagger-ui.html) through Zuul proxy


## Usage with docker-compose
1. Clone the repository `git clone https://github.com/batiwo/zuul-eureka-docker.git` 
2. Build the `zuul-eureka-docker` project with `mvn install`
3. Run `docker-compose up`
4. Go to [http://localhost:8761/](http://localhost:8761/) for eureka dashboard.
5. Access rest1 api [http://localhost/rest1/admin/page1](http://localhost/rest1/admin/page1) through Zuul proxy
6. Access rest2 api [http://localhost/rest2/download/page1](http://localhost/rest2/download/page1) through Zuul proxy
7. Access swagger-ui documentation for rest1 at [http://localhost/rest1/swagger-ui.html](http://localhost/rest1/swagger-ui.html) through Zuul proxy
8. Access swagger-ui documentation for rest2 at [http://localhost/rest2/swagger-ui.html](http://localhost/rest2/swagger-ui.html) through Zuul proxy

## Troubleshot
If the given URL do not work please be patient it could take up to 1 minutes to configure and discover all services by Zuul and Eureka.

Ensure that the red message disappear before testing requests (to ensure all service are configured).
<img src=eureka-dashboard-wait.png alt="Screenshot wait for Zuul/Eureka" width="700" height="450" border="10"/>

When the message is gone enjoy the demo. 
<img src=eureka-dashboard-ready.png alt="Screenshot demo ready" width="700" height="450" border="10"/>

## Contributor
[Sébastien DRUJONT](https://github.com/batiwo)
