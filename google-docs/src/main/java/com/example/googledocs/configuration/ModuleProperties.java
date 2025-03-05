package com.example.googledocs.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Configuration
public class ModuleProperties {
    @Value("${google-docs.module.name}")
    String name;
    @Value("${google-docs.module.uuid}")
    UUID uuid;
}
