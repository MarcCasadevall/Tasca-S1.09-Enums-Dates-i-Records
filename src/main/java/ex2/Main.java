package ex2;

public class Main {
    public enum Level {
        HIGH,MEDIUM,LOW
    }

    public static void main(String[] args) {
        Task task1 = new Task("Clean",Level.LOW);
        Task task2 = new Task("Study",Level.MEDIUM);
        Task task3 = new Task("Bills",Level.HIGH);

        task1.taskInfo();
        task2.taskInfo();
        task3.taskInfo();
    }
}
