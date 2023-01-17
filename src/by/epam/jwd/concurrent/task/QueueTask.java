package by.epam.jwd.concurrent.task;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class QueueTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private final int QUEUE_SIZE = 4;
    private final int ZERO_SIZE = 0;

    private Queue<Task> taskQueue;

    public QueueTask() {
        taskQueue = new ArrayDeque<>();
    }

    public Queue<Task> getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(Queue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public boolean addTask(Task task) {
        boolean isAdded = false;
        if (taskQueue.size() < QUEUE_SIZE) {
            taskQueue.add(task);
            isAdded = true;
            return isAdded;
        } else {
            return isAdded; 
        }
    }

    // synchronized method
    public synchronized Task getTask() {
        Task task = null;
        if (taskQueue.size() != ZERO_SIZE) {
            task = taskQueue.poll();
            return task;
        } else {
            return task;
        }
    }

     // synchronized method
    public synchronized boolean isEmpty() {
        if (taskQueue.isEmpty()) {
            return true;
        }else{
            return false;
        }            
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.taskQueue);
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
        final QueueTask other = (QueueTask) obj;
        return Objects.equals(this.taskQueue, other.taskQueue);
    }

    @Override
    public String toString() {
        return "QueueTask{" + "taskQueue=" + taskQueue + '}';
    }

}
