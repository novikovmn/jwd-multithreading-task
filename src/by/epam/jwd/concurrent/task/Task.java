package by.epam.jwd.concurrent.task;

import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable{
    
    private static final long serialVersionUID = 1L;    

    private String taskName;
    
    public synchronized void executeTask(){
        System.out.println(Thread.currentThread().getName() + " is executing " + "<" + taskName + ">");
    }

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public Task() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.taskName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        return Objects.equals(this.taskName, other.taskName);
    }

    @Override
    public String toString() {
        return "Task{" + "taskName=" + taskName + '}';
    }

}
