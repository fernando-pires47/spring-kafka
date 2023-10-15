# Spring Kafka
Example Kafka Producer and Consumer

### Dependencies
* Docker
* Docker Compose
* Java 17

### Services to run
* Consumer Service
* Producer Service
* Kafka Cluster
* Kafka UI

### To Run

Execute in root directory:

```bash
sudo docker-compose up -d 
```

### See Kafka Service in UI

Access:

```bash
http://localhost:8090
```

To add new cluster click in button

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/configure-new-cluster-ui.png)

And add 

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/new-cluster-ui.png)

Topic has been create

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/topic-new-cluster-ui.png)

To see messages sended

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/view-message-cluster-ui.png)

See consumers connected

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/consumer-new-cluster-ui.png)


### Kafka produce and consume message

To send message access your browser and run

```bash
http://localhost:8070/publish/{message}
```

To see message sended run in root project console

```bash
sudo docker-compose logs kafka-producer -f
```

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/procuder-message.png)

To see message received run in root project console

```bash
sudo docker-compose logs kafka-consumer -f
```

![](https://github.com/fernando-pires47/spring-kafka/blob/main/images/consumer-message.png)

## License

This application is available under the
[MIT license](https://opensource.org/licenses/MIT).





