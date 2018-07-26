package spring.boot.kafka.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.kafka.utils.Receiver;
import spring.boot.kafka.utils.Sender;

import java.security.PrivateKey;

@RequestMapping("/kafkatestdemo")
@RestController
public class KafkaController {

    @Autowired
    private  Sender sender;

    @Autowired
    private Receiver receiver;


    @PostMapping("/sendinfo")
    public String SendInfo(){
        sender.sendMessage();
        return null;
    }

//    @RequestMapping("/receiverinfo")
//    public String ReceiverInfo(){
//        receiver.processMessage();
//        return null;
//    }
}
