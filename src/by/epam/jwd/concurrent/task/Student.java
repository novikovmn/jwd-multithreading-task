package by.epam.jwd.concurrent.task;

public class Student extends Thread {

    private QueueTask queueTask;

    public Student(QueueTask queueTask, String string) {
        super(string);
        this.queueTask = queueTask;
    }

    @Override
    public void run() {

        while (!queueTask.isEmpty()) {
            Task theTask = queueTask.getTask();
            System.out.println(Thread.currentThread().getName() + " is executing " + "<" + theTask.getTaskName() + ">");
        }

    }

}
