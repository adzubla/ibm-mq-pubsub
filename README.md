
# Spring Boot Application with queues and topics

This is an example using both queues (point-to-point model) and topics (pub/sub model)
in the same Spring Boot Application.

### Start broker

To run this example you need to start IBM MQ

    docker run \
          --env LICENSE=accept \
          --env MQ_QMGR_NAME=QM1 \
          --publish 1414:1414 \
          --publish 9443:9443 \
          --detach \
          ibmcom/mq

### Build

    mvn clean install

### Publisher

Execute publisher. Type anything and it will be sent to the topic and the queue.

    ./pub.sh

### Subscriber
    
Open multiple subscribers, one in its own terminal:

    ./sub.sh
