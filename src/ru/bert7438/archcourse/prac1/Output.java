package ru.bert7438.archcourse.prac1;

public class Output {
    Object obj;
    public void print(String value) {
        synchronized (obj) {
            notify();
            System.out.println(value);
            try {
                wait();
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
