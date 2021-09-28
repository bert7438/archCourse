package ru.bert7438.archcourse.prac1;


public class Pinger implements Runnable {
    private boolean isActive;
    Output output;

    void disable() {
        isActive = false;
    }

    Pinger(Output o) {
        isActive = true;
        output = o;
    }

    @Override
    public void run() {
        while (isActive) {
            output.ping();
        }
    }
}

