package com.example.googledocs.domain.entity.triggers;

import com.example.googledocs.domain.entity.field.Field;
import lombok.Data;

import java.util.List;

@Data
public class Trigger {
    private String name;
    private Event event;
    private List<Field> producedFields;
}
