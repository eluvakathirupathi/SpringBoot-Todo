package org.todo.todowebservice.todo;

import java.util.Date;
import java.util.Objects;

public class TodoModel {
    private int id;
    private String desc;
    private Date target;
    private boolean done;

    public TodoModel(int id, String desc, Date target, boolean done) {
        this.id = id;
        this.desc = desc;
        this.target = target;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
                ", desc='" + desc + '\'' +
                ", target=" + target +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoModel todoModel = (TodoModel) o;
        return getId() == todoModel.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
