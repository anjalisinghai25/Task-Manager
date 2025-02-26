package com.todo.todoapp.Repository;

import com.todo.todoapp.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
