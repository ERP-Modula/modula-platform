package com.example.googledocs.configuration;

import com.example.googledocs.domain.entity.Module;
import com.example.googledocs.domain.entity.actions.Action;
import com.example.googledocs.domain.entity.triggers.Trigger;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Configuration
@RequiredArgsConstructor
public class ModuleConfiguration {

    private final ModuleProperties moduleProperties;

    private final List<Action> actions = new ArrayList<>();
    private final List<Trigger> triggers = new ArrayList<>();

    @PostConstruct
    private void initActionsAndTriggers() {
        ConfigurationUtils.putAvailableActions(actions);
        ConfigurationUtils.putAvailableTriggers(triggers);
    }

    public Module getModuleModel() {
        Module module = new Module();
        module.setId(moduleProperties.uuid);
        module.setUniqueName(moduleProperties.name);
        module.setTriggers(triggers);
        module.setActions(actions);
        return module;
    }

}
