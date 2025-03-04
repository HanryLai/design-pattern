import Decorator.BaseTask;
import Decorator.DirectorDecorator;
import Decorator.Task;
import Strategy.EmployeeStrategy;
import Strategy.EmployeeStrategyContext;
import state.DirectorState;
import state.EmployeeStateContext;

public class Main {
    public static void main(String[] args) {
        // Approach 1: No pattern
        Employee emp1 = new Employee("GIAMDOC");
        emp1.handleRequest();

        Employee emp2 = new Employee("NHANVIEN");
        emp2.handleRequest();
        System.out.println("=== Employee Tasks Examples in Different Approaches ===");

        // Approach 2: State Pattern
        System.out.println("\n-- Approach 2: State Pattern");
        EmployeeStateContext employeeStateContext = new EmployeeStateContext(new DirectorState());
        employeeStateContext.printTasks();

        System.out.println("\n-- Approach 3: Decorator Pattern");
        Task baseTask = new BaseTask();
        Task directorTask = new DirectorDecorator(baseTask);
        System.out.println("Decorator Pattern Approach => Tasks: " + directorTask.getTaskDescription());

        // Approach 4: Strategy Pattern
        System.out.println("\n-- Approach 4: Strategy Pattern");
        EmployeeStrategyContext employeeStrategyContext = new EmployeeStrategyContext(new EmployeeStrategy());
        employeeStrategyContext.printTasks();
    }
}