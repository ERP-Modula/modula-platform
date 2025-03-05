package com.example.googledocs.domain.entity;

import com.example.googledocs.domain.entity.actions.Action;
import com.example.googledocs.domain.entity.triggers.Trigger;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Module {
    private UUID id;
    private String uniqueName;
    private List<Action> actions;
    private List<Trigger> triggers;
}
