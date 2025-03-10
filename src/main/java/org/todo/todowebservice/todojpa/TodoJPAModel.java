package org.todo.todowebservice.todojpa;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Todo")
public class TodoJPAModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String UserName;
    private String description;
    private Date target;
    private boolean done;

    public TodoJPAModel(){
    }

    public TodoJPAModel(long id, String userName, String desc, Date target, boolean done) {
        this.id = id;
        UserName = userName;
        this.description = desc;
        this.target = target;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() { return UserName; }
    public void setUserName(String UserName) { this.UserName = UserName; }


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
