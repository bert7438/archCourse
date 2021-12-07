package ru.bert7438.archcourse.prac1;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        Pingponger pinger = new Pingponger("PING", obj);
        Pingponger ponger = new Pingponger("PONG", obj);
        new Thread(pinger).start();
        new Thread(ponger).start();
    }
}
