package by.epam.jwd.concurrent.task;

public final class QueueTaskUtil {

    private static final QueueTaskUtil instance = new QueueTaskUtil();

    private QueueTaskUtil() {
    }

    public static QueueTaskUtil getInstance() {
        return instance;
    }

    public QueueTask createQueueTask() {

        QueueTask queueTask = new QueueTask();
        queueTask.addTask(new Task("Walk to product store"));
        queueTask.addTask(new Task("Clean flat"));
        queueTask.addTask(new Task("Cook dinner"));
        queueTask.addTask(new Task("Draw an evacuation plan"));
        return queueTask;

    }

}
