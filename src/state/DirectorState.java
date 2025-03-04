package state;

public class DirectorState implements TaskState {
    @Override
    public void printTasks() {
        System.out.println("I am the Director. I oversee company operations.");
    }
}
