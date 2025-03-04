package Strategy;

public class EmployeeStrategyContext {
    private TaskStrategy strategy;

    public EmployeeStrategyContext(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void printTasks() {
        System.out.print("Strategy Pattern Approach => Tasks: ");
        strategy.printTasks();
    }
}
