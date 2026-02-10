package ex2and3;

public class Main {
    public enum Level {
        HIGH {
            @Override
            public String getColor() {
                return " Red";
            }
        }, MEDIUM {
            @Override
            public String getColor() {
                return " Yellow";
            }
        }, LOW {
            @Override
            public String getColor() {
                return " Green";
            }
        };

        public abstract String getColor();
    }

    public static void main(String[] args) {
        Task task1 = new Task("Clean", Level.LOW);
        Task task2 = new Task("Study", Level.MEDIUM);
        Task task3 = new Task("Bills", Level.HIGH);

        task1.taskInfo();
        task2.taskInfo();
        task3.taskInfo();
    }
}
