package com.todo.todoapp.Services;

import com.todo.todoapp.Entities.Task;
import com.todo.todoapp.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;


    public ResponseEntity<List<Task>> getAllTask() {
        List<Task> list = taskRepository.findAll();
        if (!list.isEmpty()) {
            return new ResponseEntity<>(list, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Task> getTaskById(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isPresent()) {
            return new ResponseEntity<>(task.get(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Task> createTask(Task task) {
        Task newTask = taskRepository.save(task);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteTask(Long id) {
        Optional<Task> task = taskRepository.findById(id);

        if (task.isPresent()) {
            taskRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Task> updateTask(Long id, Task task) {
        Optional<Task> optional = taskRepository.findById(id);
        if (optional.isPresent()) {
            Task newTask = optional.get();
            if (task.getTitle() != null) {
                newTask.setTitle(task.getTitle());
            }
            if (task.getDescription() != null) {
                newTask.setDescription(task.getDescription());
            }
            if (task.getCompleted() != null) {
                newTask.setCompleted(task.getCompleted());
            }
            taskRepository.save(newTask);
            return new ResponseEntity<>(newTask, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

