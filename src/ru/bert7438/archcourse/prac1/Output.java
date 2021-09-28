package ru.bert7438.archcourse.prac1;

public class Output {
    public synchronized void print(String value){
        notify();
        System.out.println(value);
        try {
            wait();
            Thread.sleep(200);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
