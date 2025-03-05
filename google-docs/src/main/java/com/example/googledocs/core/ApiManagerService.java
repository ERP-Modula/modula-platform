package com.example.googledocs.core;

import com.example.googledocs.configuration.ModuleConfiguration;
import com.example.googledocs.domain.entity.Module;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ApiManagerService {

    private final ModuleConfiguration moduleConfiguration;

    public Module getModuleApi() {
        Module module = moduleConfiguration.getModuleModel();

        // возможно будут не всегда доступные действия и добавлять их можно здесь

        return module;
    }
}
