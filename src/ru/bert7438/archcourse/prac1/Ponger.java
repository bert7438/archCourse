package ru.bert7438.archcourse.prac1;

public class Ponger implements Runnable{
    private boolean isActive;
    Output output;
    void disable() {
        isActive = false;
    }

    Ponger(Output o) {
        isActive = true;
        this.output = o;
    }

    @Override
    public void run() {
        while (isActive) {
           output.pong();
        }
    }
}
