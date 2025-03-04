package Decorator;

public class DecoratorTask implements Task {
    protected Task decoratedTask;

    public DecoratorTask(Task decoratedTask) {
        this.decoratedTask = decoratedTask;
    }

    @Override
    public String getTaskDescription() {
        return decoratedTask.getTaskDescription();
    }
}
