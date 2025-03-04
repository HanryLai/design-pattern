package Decorator;

public class BaseTask implements Task {
    @Override
    public String getTaskDescription() {
        return "Who am I?";
    }
}