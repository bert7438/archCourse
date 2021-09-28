package ru.bert7438.archcourse.prac1;

public class Output {
    public synchronized void ping(){
        notify();
        System.out.println("PING");
        try {
            wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized void pong(){
        notify();
        System.out.println("PONG");
        try {
            wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
