package ru.bert7438.archcourse.prac1;

public class Pingponger implements Runnable{
    String value;
    private boolean isActive;
    Output output;

    public Pingponger(String value, Output output) {
        this.value = value;
        this.isActive = true;
        this.output = output;
    }

    void disable() {
        isActive = false;
    }

    @Override
    public void run() {
        while (isActive) {
            output.print(value);
        }
    }
}
