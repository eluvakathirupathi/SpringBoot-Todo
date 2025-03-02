package org.todo.todowebservice.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {
    @Autowired
    private TodoService todoService;

    // Get all todos
    @GetMapping("/user/{username}/todos")
    public List<TodoModel> getAllTodos(@PathVariable String username) {
        return todoService.findAll();
    }

    @DeleteMapping("/user/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
        TodoModel todo = todoService.deleteById(id);

        if (todo != null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/user/{username}/todos/{id}")
    public TodoModel getTodo(@PathVariable String username, @PathVariable long id) {
        return todoService.findById(id);
    }

    // edit
    @PutMapping("/user/{username}/todos/{id}")
    public ResponseEntity<TodoModel> updateTodo(
            @PathVariable String username,
            @PathVariable long id,
            @RequestBody TodoModel todo) {

        TodoModel todoUpdated = todoService.save(todo);

        ResponseEntity<TodoModel> todoModelResponseEntity = new ResponseEntity<>(todo, HttpStatus.OK);
        return todoModelResponseEntity;
    }

    @PostMapping("/user/{username}/todos")
    public ResponseEntity<Void> updateTodo(
            @PathVariable String username,
            @RequestBody TodoModel todo) {

        TodoModel todocreated = todoService.save(todo);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(todocreated.getId())
                .toUri();


        return ResponseEntity.created(uri).build();
    }

}
