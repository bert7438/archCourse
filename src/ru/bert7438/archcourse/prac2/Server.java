package ru.bert7438.archcourse.prac2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends EquationSolve{
    public static void main(String[] args) {
        try{
            EquationSolve es = new EquationSolve();
            Registry registry = LocateRegistry.createRegistry(2732);
            Equation stub = (Equation) UnicastRemoteObject.exportObject(es, 0);
            registry.bind("equation", stub);
            System.err.println("Server ready");

        }
        catch (Exception e){
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
