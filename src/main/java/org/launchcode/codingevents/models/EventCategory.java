package org.launchcode.codingevents.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity{

    @NotBlank
    @Size(min = 3, max = 50, message = "Must be between 3 and 50 characters.")
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() {}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
