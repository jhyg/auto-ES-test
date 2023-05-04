package autoestest.infra;

import autoestest.config.kafka.KafkaProcessor;
import autoestest.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    StudentRepository studentRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ClassDeleted'"
    )
    public void wheneverClassDeleted_ClassCapacityPolicy(
        @Payload ClassDeleted classDeleted
    ) {
        ClassDeleted event = classDeleted;
        System.out.println(
            "\n\n##### listener ClassCapacityPolicy : " + classDeleted + "\n\n"
        );

        // Sample Logic //
        Student.classCapacityPolicy(event);
    }
}
