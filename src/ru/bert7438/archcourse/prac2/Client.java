package ru.bert7438.archcourse.prac2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry(2732);
            Equation stub = (Equation) registry.lookup("equation");
            System.out.println(stub.solve(1,1,0));
        }
        catch (Exception e){
            System.err.println("Client Exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
