package com.arthurwallace.challangerTodoList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurwallace.challangerTodoList.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
