package ru.bert7438.archcourse.prac1;

public class Main {
    public static void main(String[] args) {
        Output output = new Output();
        Pinger pinger = new Pinger(output);
        Ponger ponger = new Ponger(output);
        new Thread(pinger).start();
        new Thread(ponger).start();
    }
}
