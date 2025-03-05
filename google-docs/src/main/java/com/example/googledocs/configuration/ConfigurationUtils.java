package com.example.googledocs.configuration;

import com.example.googledocs.domain.entity.actions.Action;
import com.example.googledocs.domain.entity.field.Field;
import com.example.googledocs.domain.entity.field.FieldType;
import com.example.googledocs.domain.entity.triggers.Trigger;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationUtils {

    private static Action getListFilesAction() {
        Field field = new Field("folderId", FieldType.STRING);
        List<Field> requiredFields = new ArrayList<>();
        requiredFields.add(field);

        return Action.builder()
                .name("list files")
                .requiredFields(requiredFields)
                .producedFields(new ArrayList<>())
                .build();
    }

    public static void putAvailableActions(List<Action> actions) {

        actions.add(
            getListFilesAction()
        );
    }



    public static void putAvailableTriggers(List<Trigger> triggers) {

    }
}
