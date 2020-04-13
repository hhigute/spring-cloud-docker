# Overview



The main project we use the spring cloud "features" bellow:



* Netflix Eureka Server (Service Discovery)
* Netflix Eureka Client (Service Discovery)
* Sleuth (Distributed Trace)
  * Zipkin
* Feign (Autoconfigure and bind spring environment)

Bellow some endpoints to test the solution

| URL                                                          | PORT                             | DESCRIPTION                                      | PROJECT                             |
| ------------------------------------------------------------ | -------------------------------- | ------------------------------------------------ | ----------------------------------- |
| http://localhost:8761/                                       | 8761                             | Eureka Server                                    | spring-cloud-registry-eureka-server |
| http://localhost:9411/zipkin/                                | 9411                             | Zipkin Distributed Tracing Server                | docker install                      |
| http://localhost:8765/proxy1/calculate-iof-feign/day/1/amount/102 | 8765                             | Netflix Zull API Gateway                         | spring-zuul-api-gateway-server      |
| http://localhost:8100/calculate-iof-feign/day/1/amount/102   | 8100, 8101, 8102...              | Calculate IOF Fee                                | spring-calculate-fee-service        |
| http://localhost:8000/api/v1/iof/2                           | 8000, 8001, 8002...              | IOF reference values (Used to calculate IOF fee) | spring-preloaded-data-service       |
| http://localhost:15672/#/                                    | * 5672 (AMQP) <br />* 15672 (UI) | RabbitMQ                                         | docker install                      |

If you are interested, I created 2 more projects to show other features:

* Config Server (Configuration)
* BUS (Broadcast configuration changes)
* Netflix Hystrix (Circuit Breaker)



| URL                                               | PORT | DESCRIPTION                                          | PROJECT                    |
| ------------------------------------------------- | ---- | ---------------------------------------------------- | -------------------------- |
| http://localhost:8888/spring-limits-service/qa    | 8888 | Spring Cloud Config  (Show the configuration values) | spring-cloud-config-server |
| http://localhost:8080/actuator/refresh            | 8080 | Refresh configuration but not apply to all nodes     | spring-limits-service      |
| (POST) http://localhost:8080/actuator/bus-refresh | 8080 | BUS (Refresh configuration in all nodes)             | spring-limits-service      |
| http://localhost:8080/limits                      | 8080 | Example client using cloud config                    | spring-limits-service      |
| http://localhost:8080/limits-fault-tolerance      | 8080 | Hystrix - Fault Tolerance                            | spring-limits-service      |





# Setup Project (main project)

First you have to run the command bellow that will install and prepare the third applications

*  MS SQL Server
  * The script will create our database and tables 
* Rabbit MQ
* Zipikin



