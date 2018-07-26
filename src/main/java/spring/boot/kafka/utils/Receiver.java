package spring.boot.kafka.utils;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;
import spring.boot.kafka.model.Message;

@Service
public class Receiver {

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "mytopic")
    public void processMessage(String content) {
        System.out.println("===================================");
        System.out.println(content);
        System.out.println("===================================");
        Message m = gson.fromJson(content, Message.class);
    }
}
