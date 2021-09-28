package ru.bert7438.archcourse.prac1;

public class Main {
    public static void main(String[] args) {
        Output output = new Output();
        Pingponger pinger = new Pingponger("PING", output);
        Pingponger ponger = new Pingponger("PONG", output);
        new Thread(pinger).start();
        new Thread(ponger).start();
    }
}
