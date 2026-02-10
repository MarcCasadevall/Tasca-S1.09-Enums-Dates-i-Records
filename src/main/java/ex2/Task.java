package ex2;

public class Task {
    private final String name;
    private final Main.Level level;

    public Task(String name, Main.Level level) {
        this.name = name;
        this.level = level;
    }


    public void taskInfo() {
        switch (level) {
            case LOW -> System.out.println(name + ": low priority");
            case MEDIUM -> System.out.println(name + ": medium priority");
            case HIGH -> System.out.println(name + ": high priority");
        }
    }
}
