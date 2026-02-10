package ex2and3;

public class Task {
    private final String name;
    private final Main.Level level;

    public Task(String name, Main.Level level) {
        this.name = name;
        this.level = level;
    }


    public void taskInfo() {
        switch (level) {
            case LOW -> System.out.println(name + ": low priority" + level.getColor());
            case MEDIUM -> System.out.println(name + ": medium priority" + level.getColor());
            case HIGH -> System.out.println(name + ": high priority" + level.getColor());
        }
    }
}
