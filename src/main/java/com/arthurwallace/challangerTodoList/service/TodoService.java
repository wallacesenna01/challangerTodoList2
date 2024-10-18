package com.arthurwallace.challangerTodoList.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.arthurwallace.challangerTodoList.entity.Todo;
import com.arthurwallace.challangerTodoList.repositories.TodoRepository;

@Service
public class TodoService {
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    private TodoRepository todoRepository;

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

   public List<Todo> list(){
         Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll();
    }

  public  List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

  public  List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }

}
