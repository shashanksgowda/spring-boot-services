#Steps to start

##start container
```docker-compose up -d```

##create topic
``docker exec -it <container-id> kafka-topics.sh --create --topic user-activity --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
``





