package org.todo.todowebservice.todojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoJPAController {
    @Autowired
    private TodoJPAService todoJPAService;

    // Get all todos
    @GetMapping("/jpa/user/{username}/todos")
    public List<TodoJPAModel> getAllTodos(@PathVariable String username) {
        return todoJPAService.findAll();
    }

//    @DeleteMapping("/jpa/user/{username}/todos/{id}")
//    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
//        TodoJPAModel todo = todoJPAService.deleteById(id);
//
//        if (todo != null) {
//            return ResponseEntity.noContent().build();
//        }
//        return ResponseEntity.notFound().build();
//    }
//
    @GetMapping("/jpa/user/{username}/todos/{id}")
    public Optional<TodoJPAModel> getTodo(@PathVariable String username, @PathVariable long id) {
        return todoJPAService.findById(id);
    }
//
//    // edit
//    @PutMapping("/jpa/user/{username}/todos/{id}")
//    public ResponseEntity<TodoJPAModel> updateTodo(
//            @PathVariable String username,
//            @PathVariable long id,
//            @RequestBody TodoJPAModel todo) {
//
//        TodoJPAModel todoUpdated = todoJPAService.save(todo);
//
//        ResponseEntity<TodoJPAModel> todoModelResponseEntity = new ResponseEntity<>(todo, HttpStatus.OK);
//        return todoModelResponseEntity;
//    }
//
//    @PostMapping("/jpa/user/{username}/todos")
//    public ResponseEntity<Void> updateTodo(
//            @PathVariable String username,
//            @RequestBody TodoJPAModel todo) {
//
//        TodoJPAModel todocreated = todoJPAService.save(todo);
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}").buildAndExpand(todocreated.getId())
//                .toUri();
//
//
//        return ResponseEntity.created(uri).build();
//    }

}
