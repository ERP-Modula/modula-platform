package com.example.googledocs.configuration;

import com.example.googledocs.domain.command.Command;
import com.example.googledocs.domain.entity.triggers.Trigger;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CQRSConfiguration {
    private final Map<String, Command> nameToCommandMap = new HashMap<>();
    private final Map<String, Trigger> nameToTriggerMap = new HashMap<>();

    @PostConstruct
    private void initMaps() {

    }
}
