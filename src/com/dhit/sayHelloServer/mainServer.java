/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhit.sayHelloServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Radhitee
 */
public class mainServer {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.createRegistry(2527);
        sayHelloServer sayHellow = new sayHelloServer();
        registry.rebind("say", sayHellow);
        System.out.println("Server berjalan");
    }
}
