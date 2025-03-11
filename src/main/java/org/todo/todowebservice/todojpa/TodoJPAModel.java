package org.todo.todowebservice.todojpa;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Todo")
public class TodoJPAModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String description;
    private Date target;
    private boolean done;

    public TodoJPAModel(){
    }

    public TodoJPAModel(long id, String username, String desc, Date target, boolean done) {
        this.id = id;
        this.username = username;
        this.description = desc;
        this.target = target;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() { return username; }
    public void setUsername(String UserName) { this.username = UserName; }


    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public Date getTarget() {
        return target;
    }

    public void setTarget(Date target) {
        this.target = target;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "TodoModel{" +
                "id=" + id +
                ", desc='" + description + '\'' +
                ", target=" + target +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoJPAModel todoJPAModel = (TodoJPAModel) o;
        return getId() == todoJPAModel.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
