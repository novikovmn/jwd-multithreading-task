package by.epam.jwd.concurrent.task;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTask {

    private Queue<Task> taskQueue;

    {
        taskQueue = new ArrayDeque<>();
        taskQueue.add(new Task("Walk to product store"));
        taskQueue.add(new Task("Clean flat"));
        taskQueue.add(new Task("Cook dinner"));
        taskQueue.add(new Task("Draw an evacuation plan"));
    }

    public Queue<Task> getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(Queue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

}
