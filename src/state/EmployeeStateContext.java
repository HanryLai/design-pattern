package state;

public class EmployeeStateContext {
    private TaskState state;

    public EmployeeStateContext(TaskState state) {
        this.state = state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void printTasks() {
        System.out.print("State Pattern Approach => Tasks: ");
        state.printTasks();
    }
}
