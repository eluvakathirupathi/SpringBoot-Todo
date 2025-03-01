package org.todo.todowebservice.todo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TodoService {
    private static List<TodoModel> todos = new ArrayList<>();
    private static int id=0;
    static {
        todos.add(new TodoModel(++id,"Learn java",new Date(),false));
        todos.add(new TodoModel(++id,"Learn SpringBoot",new Date(),false));
    }
    public List<TodoModel> findAll(){
        return todos;
    }
    public TodoModel deleteById(long id){
        TodoModel todo = findById(id);
        if(todo==null) return null;

        if(todos.remove(todo)){
            return  todo;
        }
        return null;
    }
    public TodoModel findById(long id){
        for(TodoModel Todo: todos){
            if(Todo.getId()==id){
                return Todo;
            }
        }
        return null;
    }
}
