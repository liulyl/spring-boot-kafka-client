package spring.boot.kafka;


import org.apache.kafka.common.network.Send;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.boot.kafka.service.AppKafkaClient;
import spring.boot.kafka.utils.Receiver;
import spring.boot.kafka.utils.Sender;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=AppKafkaClient.class)
@ActiveProfiles(value = "dev")
public class AppTest
{
   @Autowired
    private Sender send;
    @Autowired
    private Receiver receiver;

   @Test
   public void testSendInfo(){
     send.sendMessage();

   }





}
