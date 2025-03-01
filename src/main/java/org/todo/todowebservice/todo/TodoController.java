package org.todo.todowebservice.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {
    @Autowired
    private TodoService todoService;

    // Get all todos
    @GetMapping("/user/{username}/todos")
    public List<TodoModel> getAllTodos(@PathVariable String username){
        return todoService.findAll();
    }

    @DeleteMapping("/user/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
        TodoModel todo = todoService.deleteById(id);

        if(todo!= null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
