package com.arthurwallace.challangerTodoList.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "todos")
public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @NotBlank
    private String name;

    @NotBlank
    private String description;

    private boolean realized;

    @NotNull
    private Integer priority;

    
    public Todo(String name, String description, boolean realized, Integer priority) {
       
        this.name = name;
        this.description = description;
        this.realized = realized;
        this.priority = priority;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean getRealized() {
        return realized;
    }
    public void setRealized(boolean realized) {
        this.realized = realized;
    }
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    

}
