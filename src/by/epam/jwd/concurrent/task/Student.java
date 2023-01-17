package by.epam.jwd.concurrent.task;

import java.util.Queue;

public class Student extends Thread {

    private QueueTask queueTask;

    public Student(QueueTask queueTask, String string) {
        super(string);
        this.queueTask = queueTask;
    }

    @Override
    public void run() {
        
        Queue<Task> taskQueue = queueTask.getTaskQueue();
        while (!taskQueue.isEmpty()) {
            taskQueue.poll().executeTask();
        } 

    }

}
