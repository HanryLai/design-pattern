package Decorator;

public class DirectorDecorator extends DecoratorTask {
    public DirectorDecorator(Task decoratedTask) {
        super(decoratedTask);
    }

    @Override
    public String getTaskDescription() {
        return super.getTaskDescription() + " I am the director.";
    }
}
