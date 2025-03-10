package org.todo.todowebservice.todojpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface TodoJPAService extends JpaRepository<TodoJPAModel,Long> {

}
