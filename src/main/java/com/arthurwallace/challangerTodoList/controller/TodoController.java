package com.arthurwallace.challangerTodoList.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthurwallace.challangerTodoList.entity.Todo;
import com.arthurwallace.challangerTodoList.service.TodoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<Todo> create(@Valid @RequestBody Todo todo) {

        return ResponseEntity.ok(todo);
    }

    @GetMapping
    List<Todo> list() {

        return todoService.list();

    }

    @PutMapping
    List<Todo> updade(@RequestBody Todo todo) {

        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {

        return todoService.delete(id);
    }

}
