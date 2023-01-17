package by.epam.jwd.concurrent.task;

public class FlatDemo {

    public static void main(String[] args) {

        /*
            Students live in a flat.
            And they doing housework.
        
            4 tasks
            2 students
        
         */
        
        QueueTask queueTask = new QueueTask();
        Student student1 = new Student(queueTask, "student1");
        Student student2 = new Student(queueTask, "student2");

        student1.start();
        student2.start();

    }
}
