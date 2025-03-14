package modula.platform.googledocs.core.utils.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ModulaPlatformConsumer {

    @KafkaListener(topics = "core-to-modula-data", groupId = "modula-group")
    public void consumeDataFromCore(String data) {
        System.out.println("Received data from core: " + data);
        // Process the data
    }

    @KafkaListener(topics = "core-to-modula-tasks", groupId = "modula-group")
    public void consumeTaskFromCore(String task) {
        System.out.println("Received task from core: " + task);
        // Process the task
    }
}
