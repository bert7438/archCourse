package ru.bert7438.archcourse.prac1;

public class Pingponger implements Runnable {
    String value;
    private boolean isActive;
    Object obj;

    public Pingponger(String value, Object obj) {
        this.value = value;
        this.isActive = true;
        this.obj = obj;
    }

    void disable() {
        isActive = false;
    }

    @Override
    public void run() {
        synchronized (obj) {
            while (isActive) {
                try {
                    System.out.println(value);
                    Thread.sleep(1000);
                    obj.notify();
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
