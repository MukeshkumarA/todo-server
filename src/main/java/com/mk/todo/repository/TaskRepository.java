package com.mk.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.todo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
