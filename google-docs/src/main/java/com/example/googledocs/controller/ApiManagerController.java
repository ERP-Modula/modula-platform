package com.example.googledocs.controller;

import com.example.googledocs.core.ApiManagerService;
import com.example.googledocs.domain.entity.Module;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("api/v1")
public class ApiManagerController {

    private final ApiManagerService apiManagerService;

    @GetMapping("/module")
    public Module getModuleApi() {
        return apiManagerService.getModuleApi();
    }
}
