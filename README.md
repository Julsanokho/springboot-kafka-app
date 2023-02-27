# SPRING BOOT KAFKA APP

# *** DOCKER KAFKA ***

#   RUN KAFKA DOCKER COMPOSE YML FILE CONFIGURATION:

## $ docker-compose -f docker-compose.yml up -d

## $ docker exec -it kafka /bin/sh

## $ pwd 
## $ ls 
## $ cd opt/kafka_2.13-2.8.1/bin/

# *Create Topics:
## $ kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic doker_kafka_demo

# **List Topics: 
## $ kafka-topics.sh --list --zookeeper zookeeper:2181

# ***Describe Topics
## $ kafka-topics.sh --describe --zookeeper zookeeper:2181 --topic doker_kafka_demo

# ****Delete Topics:
## $ kafka-topics.sh --zookeeper zookeeper:2181 delete --topic doker_kafka_demo

# ***** To writes messages
## $ kafka-console-producer.sh --broker-list kafka:9092 --topic doker_kafka_demo

# ******Consume message
## $ kafka-console-consumer.sh --bootstrap-server kafka:9092 --topic selftuts_json --from-beginning
