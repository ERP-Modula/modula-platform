package modula.platform.googledocs.core.utils.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ModulaPlatformProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ModulaPlatformProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendDataToCore(String data) {
        kafkaTemplate.send("modula-to-core-data", data);
    }

    public void sendTaskResultToCore(String result) {
        kafkaTemplate.send("modula-to-core-tasks", result);
    }
}