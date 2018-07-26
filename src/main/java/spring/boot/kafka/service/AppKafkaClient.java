package spring.boot.kafka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication(scanBasePackages={"spring.boot.kafka.utils","spring.boot.kafka.action"})
public class AppKafkaClient {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext app = SpringApplication.run(AppKafkaClient.class, args);


    }


}
